package com.example.demo.ParkingSlot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Worker.Worker;
import com.example.demo.Worker.WorkerService;
import com.example.demo.WorkerLocationLog.WorkerLocationLog;
import com.example.demo.WorkerLocationLog.WorkerLocationLogService;
import com.example.demo.WorkerserviceLog.WorkerserviceLog;
import com.example.demo.WorkerserviceLog.WorkerserviceLogService;

@Controller
public class ParkingSlotController {
	
	@Autowired
	private ParkingSlotService service;
	@Autowired
	private WorkerLocationLogService wll;
	@Autowired
	private WorkerserviceLogService wss;
	@Autowired
	private WorkerService w;
	@GetMapping("/displayParkingSlots")
	public ModelAndView displayParkingSlots(@RequestParam("location") String location, @RequestParam("date") String date, @RequestParam("checkInTime") String checkInTime , @RequestParam("checkOutTime") String checkOutTime,
			ModelAndView mv,RedirectAttributes redirectAttributes)
	{
		
		List <ParkingSlot> parkingList=service.getParkingSlot(location,date,checkInTime,checkOutTime);
		List <WorkerLocationLog> workLocationList = wll.getWorker(location,date,checkInTime,checkOutTime);
		List <WorkerserviceLog> workserviceList = wss.getServiceById(workLocationList);
		List <Worker> workerList = w.getServiceById(workLocationList);
		redirectAttributes.addFlashAttribute("parkingList", parkingList);
		mv.setViewName("displayParkingSlots");
		mv.addObject("parkingList", parkingList);
		mv.addObject("location", location);
		mv.addObject("checkInTime", checkInTime);
		mv.addObject("checkOutTime", checkOutTime);
		mv.addObject("workLocationList", workLocationList);
		mv.addObject("workserviceList", workserviceList);
		mv.addObject("workerList", workerList);
		return mv;
	}
	@GetMapping("searchParkingSlots")
	public ModelAndView searchParkingSlots(ModelAndView mv)
		{
			mv.setViewName("searchParkingSlots");
			return mv;
		}

}
