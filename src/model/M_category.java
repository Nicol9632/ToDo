package model;

import java.io.Serializable;

/**
 * m_category 対応のモデルクラス
 * @author Akane Ota
 *
 */
public class M_category implements Serializable {

	private int c_id;
	private String c_name;
	private String c_color;

	/**
	 * Beans 用の引数なしのコンストラクタ
	 */
	public M_category() {
	}

	/**
	 * m_category 対応のコンストラクタ
	 * @param c_id		カテゴリID
	 * @param c_name	カテゴリ名称
	 * @param c_color	カラーコード
	 */
	public M_category( int c_id, String c_name, String c_color){
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_color = c_color;
	}

	/**
	 * @return c_id
	 */
	public int getC_id() {
		return c_id;
	}

	/**
	 * @param c_id セットする c_id
	 */
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	/**
	 * @return c_name
	 */
	public String getC_name() {
		return c_name;
	}

	/**
	 * @param c_name セットする c_name
	 */
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	/**
	 * @return c_color
	 */
	public String getC_color() {
		return c_color;
	}

	/**
	 * @param c_color セットする c_color
	 */
	public void setC_color(String c_color) {
		this.c_color = c_color;
	}
}
