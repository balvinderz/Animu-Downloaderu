package com.dakusuta.tools.anime.download;

/**
 * @author Rahul S<br>
 *         This class contains segment details for each downloads
 */
public class Segment {
	public long start; // Start byte location
	public long end; // End byte location
	public long downloaded; // bytes downloaded
	public String file; // File name of downloaded segment

	Segment(long start, long end, String file) {
		this.start = start;
		this.end = end;
		this.downloaded = 0;
		this.file = file;
	}

	Segment(long start, long end, long downloaded, String file) {
		this.start = start;
		this.end = end;
		this.downloaded = downloaded;
		this.file = file;
	}

	// Returns whether the download is finished or not
	boolean isFinished() {
		return start > end;
	}

	@Override
	public String toString() {
		return String.format("Start : %d end : %d downloaded : %d file : %s", start, end, downloaded, file);
	}
}
