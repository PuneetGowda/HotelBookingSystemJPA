package com.entlogics.hotelbookingsystemjpa.dao;

import java.util.List;

import com.entlogics.hotelbookingsystemjpa.dto.BookingDTO;
import com.entlogics.hotelbookingsystemjpa.dto.CustomerDTO;
import com.entlogics.hotelbookingsystemjpa.dto.EmployeeDTO;
import com.entlogics.hotelbookingsystemjpa.dto.HotelDTO;
import com.entlogics.hotelbookingsystemjpa.dto.HotelInformationDTO;
import com.entlogics.hotelbookingsystemjpa.dto.RoomDTO;
import com.entlogics.hotelbookingsystemjpa.dto.ServiceDTO;
import com.entlogics.hotelbookingsystemjpa.entity.Hotel;

public interface IHotelDAO {

	List<Object[]> getListOfHotels(String hotel_name);

	List<Object[]> getHotelInformation(int hotel_id);

	List<Object[]> getAllCustomersOfHotel(int hotel_id);

	List<Object[]> getAllBookingsOfHotel(int hotel_id);

	List<Object[]> getAllServicesOfHotel(int hotel_id);

	List<Object[]> getAllEmployeesOfHotel(int hotel_id);

	List<Object[]> getAllRoomsOfHotel(int hotel_id);

	boolean addNewHotel(Hotel hotel);

	boolean editHotel(int hotel_id, Hotel hotel);

	boolean deleteHotel(int hotel_id);

}
