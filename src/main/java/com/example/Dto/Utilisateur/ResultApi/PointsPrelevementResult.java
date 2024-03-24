package com.example.Dto.Utilisateur.ResultApi;

import java.util.List;

import com.example.Entity.ZonePrelevement;
public class PointsPrelevementResult {
    private int count;
    private String first;
    private String last;
    private String prev;
    private String next;
    private String apiVersion;
    private List<zonePrelevementReceive> data;

	public List<zonePrelevementReceive> getData() {
		return data;
	}

	public void setData(List<zonePrelevementReceive> data) {
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

	public PointsPrelevementResult(int count, String first, String last, String prev, String next, String apiVersion,
			List<zonePrelevementReceive> data) {
		super();
		this.count = count;
		this.first = first;
		this.last = last;
		this.prev = prev;
		this.next = next;
		this.apiVersion = apiVersion;
		this.data = data;
	}
	
	public PointsPrelevementResult() {
		
	}

	@Override
	public String toString() {
		return "PointsPrelevementResult [data=" + data + "]";
	}

    // Getters and setters for the 'data' field
    
}

