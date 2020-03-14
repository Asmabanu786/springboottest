package com.cts.bcs.beans;

public class BookCatalogItem {
	

		String name, description,author;
		int rating;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getRating() {
			return rating;
		}

		public BookCatalogItem(String name, String description,String author, int rating) {
			this.name = name;
			this.description = description;
			this.author=author;
			this.rating = rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		

	}





