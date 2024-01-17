package com.entlogics.hotelbookingsystemjpa.observer;

import com.entlogics.hotelbookingsystemjpa.entity.Booking;

// abstract observer
public interface BookingObserver {

	void updated(Booking booking);
}
