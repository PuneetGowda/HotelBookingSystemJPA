package com.entlogics.hotelbookingsystemjpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//This class is entity having service detail fields, getters and setters, and to String method
@Entity
@Table(name = "service")
@NamedQueries(value= {
		@NamedQuery(name="GET_ALL_SERVICES_OF_HOTEL", query="select s.service_id, s.service_name, hs.service_price from Service s join s.hotels hs where hs.hotel.hotel_id=:hotel_id")
})
public class Service {

	// Defining the fields and map them to columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private int service_id;

	@Column(name = "service_name")
	private String service_name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "service", cascade = CascadeType.ALL)
	List<HotelService> hotels;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel_service", cascade = CascadeType.ALL)
	List<BookingService> bookings;

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public List<HotelService> getHotels() {
		return hotels;
	}

	public void setHotels(List<HotelService> hotels) {
		this.hotels = hotels;
	}

	public List<BookingService> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingService> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Service [service_id=" + service_id + ", service_name=" + service_name + "]";
	}
}
