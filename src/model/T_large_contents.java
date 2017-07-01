package model;

import java.io.Serializable;

/**
 *  t_large_contents に対応したモデルクラス
 * @author Akane Ota
 *
 */
public class T_large_contents implements Serializable {

	private int l_id;
	private String l_name;
	private int c_id;

	/**
	 * Beans 用の引数なしのコンストラクタ
	 */
	public T_large_contents() {
	}

	/**
	 * t_large_contents 対応のコンストラクタ
	 * @param l_id		大項目ID
	 * @param l_name	摘要
	 * @param c_id		カテゴリID（m_category と対応）
	 */
	public T_large_contents(int l_id, String l_name, int c_id){
		this.l_id = l_id;
		this.l_name = l_name;
		this.c_id = c_id;
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
	 * @return l_name
	 */
	public String getL_name() {
		return l_name;
	}

	/**
	 * @param l_name セットする l_name
	 */
	public void setL_name(String l_name) {
		this.l_name = l_name;
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



}
