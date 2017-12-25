package com.learn.downloader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class DownloadTask implements Runnable {

	private long start;
	private long end;
	private InputStream inputStream;
	private RandomAccessFile randomAccessFile;
	private final int BUF_LEN = 1024;
	/* internal buffer used by downloading thread */
	private byte[] buf = new byte[BUF_LEN];

	public DownloadTask(long start, long end, InputStream inputStream, RandomAccessFile randomAccessFile) {
		System.out.println("Thread "+Thread.currentThread().getName()+" downloads from "+start + " to "+end);
		this.start = start;
		this.end = end;
		this.inputStream = inputStream;
		this.randomAccessFile = randomAccessFile;
	}

	@Override
	public void run() {

		try {
			long length = end - start + 1;
			int hasRead = 0;
			randomAccessFile.seek(start);
			inputStream.skip(start);
			while ((hasRead = inputStream.read(buf)) > 0)
				randomAccessFile.write(buf, 0, hasRead);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
			if(inputStream!=null)
			inputStream.close();
			if(randomAccessFile!=null)
			randomAccessFile.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Thread :: "+Thread.currentThread().getName()+ " ends");
		}

	}

}
