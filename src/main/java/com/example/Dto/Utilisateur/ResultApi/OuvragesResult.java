package com.example.Dto.Utilisateur.ResultApi;

import java.io.ObjectInputStream.GetField;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class OuvragesResult {
    private int count;
    private String first;
    private String last;
    private String prev;
    private String next;
    private String apiVersion;
    private List<OuvrageDTO> data;

    
    // Getters and setters for the 'data' field
    
	public List<OuvrageDTO> getData() {
		return data;
	}
	
	public void setData(List<OuvrageDTO> data) {

		this.data = data;
	}
	
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getPrev() {
		return prev;
	}

	public void setPrev(String prev) {
		this.prev = prev;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	// Constructors
	public OuvragesResult() {
	}

	

	public OuvragesResult(int count, String first, String last, String prev, String next, String apiVersion,
			List<OuvrageDTO> data) {
		super();
		this.count = count;
		this.first = first;
		this.last = last;
		this.prev = prev;
		this.next = next;
		this.apiVersion = apiVersion;
		this.data = data;
	}

	// toString method
	@Override
	public String toString() {
		return "OuvragesResult [data=" + data + "]";
	}
}

