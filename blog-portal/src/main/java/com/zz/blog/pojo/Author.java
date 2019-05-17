package com.zz.blog.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zz
 * @since 2019-05-17
 */
public class Author extends Model<Author> {

    private static final long serialVersionUID = 1L;

    /**
     * 作者表主键id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 作者名称
     */
	@TableField("author_name")
	private String authorName;
    /**
     * 作者年龄
     */
	@TableField("author_age")
	private Integer authorAge;
    /**
     * 作者昵称
     */
	@TableField("author_nickname")
	private String authorNickname;
    /**
     * 作者职业
     */
	@TableField("author_profession")
	private String authorProfession;
    /**
     * 作者现居住地
     */
	@TableField("author_nowaddress")
	private String authorNowaddress;
    /**
     * 作者邮箱
     */
	@TableField("author_email")
	private String authorEmail;
    /**
     * 作者简介
     */
	@TableField("author_introduction")
	private String authorIntroduction;
    /**
     * 是否删除(逻辑删除)0为删除,1位生效
     */
	@TableField("author_isDelete")
	private Integer authorIsDelete;
    /**
     * 与留言表关联id
     */
	@TableField("author_leavingMessage_id")
	private Long authorLeavingMessageId;


	public Long getId() {
		return id;
	}

	public Author setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAuthorName() {
		return authorName;
	}

	public Author setAuthorName(String authorName) {
		this.authorName = authorName;
		return this;
	}

	public Integer getAuthorAge() {
		return authorAge;
	}

	public Author setAuthorAge(Integer authorAge) {
		this.authorAge = authorAge;
		return this;
	}

	public String getAuthorNickname() {
		return authorNickname;
	}

	public Author setAuthorNickname(String authorNickname) {
		this.authorNickname = authorNickname;
		return this;
	}

	public String getAuthorProfession() {
		return authorProfession;
	}

	public Author setAuthorProfession(String authorProfession) {
		this.authorProfession = authorProfession;
		return this;
	}

	public String getAuthorNowaddress() {
		return authorNowaddress;
	}

	public Author setAuthorNowaddress(String authorNowaddress) {
		this.authorNowaddress = authorNowaddress;
		return this;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public Author setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
		return this;
	}

	public String getAuthorIntroduction() {
		return authorIntroduction;
	}

	public Author setAuthorIntroduction(String authorIntroduction) {
		this.authorIntroduction = authorIntroduction;
		return this;
	}

	public Integer getAuthorIsDelete() {
		return authorIsDelete;
	}

	public Author setAuthorIsDelete(Integer authorIsDelete) {
		this.authorIsDelete = authorIsDelete;
		return this;
	}

	public Long getAuthorLeavingMessageId() {
		return authorLeavingMessageId;
	}

	public Author setAuthorLeavingMessageId(Long authorLeavingMessageId) {
		this.authorLeavingMessageId = authorLeavingMessageId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Author{" +
			"id=" + id +
			", authorName=" + authorName +
			", authorAge=" + authorAge +
			", authorNickname=" + authorNickname +
			", authorProfession=" + authorProfession +
			", authorNowaddress=" + authorNowaddress +
			", authorEmail=" + authorEmail +
			", authorIntroduction=" + authorIntroduction +
			", authorIsDelete=" + authorIsDelete +
			", authorLeavingMessageId=" + authorLeavingMessageId +
			"}";
	}
}
