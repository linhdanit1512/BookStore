package entity;
// Generated May 22, 2017 7:24:23 PM by Hibernate Tools 5.2.3.Final

/**
 * ChapterContentId generated by hbm2java
 */
public class ChapterContentId implements java.io.Serializable {

	private static final long serialVersionUID = -5136847821704139106L;
	private int chapterId;
	private int chapter;

	public ChapterContentId() {
	}

	public ChapterContentId(int chapterId, int chapter) {
		this.chapterId = chapterId;
		this.chapter = chapter;
	}

	public int getChapterId() {
		return this.chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public int getChapter() {
		return this.chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChapterContentId))
			return false;
		ChapterContentId castOther = (ChapterContentId) other;

		return (this.getChapterId() == castOther.getChapterId()) && (this.getChapter() == castOther.getChapter());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getChapterId();
		result = 37 * result + this.getChapter();
		return result;
	}

}
