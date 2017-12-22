package com.learn.downloader;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentDownloader {

	public static void main(String[] args) {

		final Integer TOTAL_THREADS = Integer.parseInt(args[0]);
		InputStream[] is = new InputStream[TOTAL_THREADS];
		RandomAccessFile[] out = new RandomAccessFile[TOTAL_THREADS];

		try {

			final URL url = new URL(args[1]);
			final String OUTPUT_FILE = args[2];
			ExecutorService service = Executors.newFixedThreadPool(TOTAL_THREADS);

			long contentLength = url.openConnection().getContentLengthLong();
			if (contentLength < 0) {
				System.out.println("There is some issue with the url. Could download the content...");
				System.exit(1);
			} else {
				System.out.println("The total file content :: " + contentLength + " bytes");
			}

			long bytes_per_thread = contentLength / TOTAL_THREADS;
			is[0] = url.openStream();
			out[0] = new RandomAccessFile(OUTPUT_FILE, "rw");

			for (int count = 0; count < TOTAL_THREADS; count++) {
				if (count != 0) {
					is[count] = url.openStream();
					out[count] = new RandomAccessFile(OUTPUT_FILE, "rw");

				}

				if (count != TOTAL_THREADS - 1) {
					service.execute(new DownloadTask(count * bytes_per_thread, (count + 1) * bytes_per_thread - 1,
							is[count], out[count]));
				} else {
					service.execute(
							new DownloadTask(count * bytes_per_thread, contentLength - 1, is[count], out[count]));
				}
			}
			service.shutdown();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
