package com.example.types;

public class ItemList {
private String row_title;
private int row_id;
public ItemList() {}
public ItemList(String row_title,int row_id) {
	this.row_id=row_id;
	this.row_title=row_title;
}
public String getRow_title() {
	return row_title;
}
public void setRow_title(String row_title) {
	this.row_title = row_title;
}
public int getRow_id() {
	return row_id;
}
public void setRow_id(int row_id) {
	this.row_id = row_id;
}
@Override
public String toString() {
	return "ItemList [row_title=" + row_title + ", row_id=" + row_id + "]";
}

}
