package com.demo.hospitalManagement.service;

import com.demo.hospitalManagement.dto.AppointmentRequestDto;
import com.demo.hospitalManagement.dto.AppointmentResponseDto;

/**
 * @author Suma
 *
 */
public interface AppointmentService {
	
	
	public AppointmentResponseDto bookAnAppointment(AppointmentRequestDto appointmentRequestDto,Long userId);
	

}
