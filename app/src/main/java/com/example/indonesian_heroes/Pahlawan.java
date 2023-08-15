package com.example.indonesian_heroes;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Pahlawan{

	@SerializedName("daftar_pahlawan")
	private List<DaftarPahlawanItem> daftarPahlawan;

	public List<DaftarPahlawanItem> getDaftarPahlawan(){
		return daftarPahlawan;
	}
}