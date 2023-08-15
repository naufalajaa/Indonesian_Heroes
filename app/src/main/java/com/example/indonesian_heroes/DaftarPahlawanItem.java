package com.example.indonesian_heroes;

import com.google.gson.annotations.SerializedName;

public class DaftarPahlawanItem{

	@SerializedName("nama2")
	private String nama2;

	@SerializedName("asal")
	private String asal;

	@SerializedName("usia")
	private String usia;

	@SerializedName("img")
	private String img;

	@SerializedName("lahir")
	private String lahir;

	@SerializedName("lokasimakam")
	private String lokasimakam;

	@SerializedName("nama")
	private String nama;

	@SerializedName("gugur")
	private String gugur;

	@SerializedName("kategori")
	private String kategori;

	@SerializedName("history")
	private String history;

	public String getNama2(){
		return nama2;
	}

	public String getAsal(){
		return asal;
	}

	public String getUsia(){
		return usia;
	}

	public String getImg(){
		return img;
	}

	public String getLahir(){
		return lahir;
	}

	public String getLokasimakam(){
		return lokasimakam;
	}

	public String getNama(){
		return nama;
	}

	public String getGugur(){
		return gugur;
	}

	public String getKategori(){
		return kategori;
	}

	public String getHistory(){
		return history;
	}
}