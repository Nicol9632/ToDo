package model;

import java.io.Serializable;
import java.sql.Date;

/**
 * t_small_contents と対応したモデルクラス
 * @author naoki0611
 *
 */
public class T_small_contents implements Serializable {
	private int s_id;
	private int l_id;
	private String s_name;
	private Date s_date;
	private boolean s_end_flg;

	/**
	 * Beans 用の引数なしのコンストラクタ
	 */
	public T_small_contents() {
	}

	/**
	 * t_small_contents 対応のコンストラクタ
	 * @param s_id			小項目ID
	 * @param l_id			大項目ID（t_large_contents と対応）
	 * @param s_name		摘要
	 * @param s_date		終了予定日
	 * @param s_end_flg	達成フラグ
	 */
	public T_small_contents( int s_id, int l_id, String s_name, Date s_date, boolean s_end_flg){
		this.s_id = s_id;
		this.l_id = l_id;
		this.s_name = s_name;
		this.s_date = s_date;
		this.s_end_flg = s_end_flg;
	}

	/**
	 * @return s_id
	 */
	public int getS_id() {
		return s_id;
	}

	/**
	 * @param s_id セットする s_id
	 */
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	/**
	 * @return l_id
	 */
	public int getL_id() {
		return l_id;
	}

	/**
	 * @param l_id セットする l_id
	 */
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	/**
	 * @return s_name
	 */
	public String getS_name() {
		return s_name;
	}

	/**
	 * @param s_name セットする s_name
	 */
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	/**
	 * @return s_date
	 */
	public Date getS_date() {
		return s_date;
	}

	/**
	 * @param s_date セットする s_date
	 */
	public void setS_date(Date s_date) {
		this.s_date = s_date;
	}

	/**
	 * @return s_end_flg
	 */
	public boolean isS_end_flg() {
		return s_end_flg;
	}

	/**
	 * @param s_end_flg セットする s_end_flg
	 */
	public void setS_end_flg(boolean s_end_flg) {
		this.s_end_flg = s_end_flg;
	}

}
