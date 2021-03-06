package com.myspring.eium.hm.hm_p0021.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface HM_P0021Controller {

	ModelAndView homeInit(HttpServletRequest request, HttpServletResponse response) throws Exception;

	Map searchList(HttpServletRequest request, HttpServletResponse response) throws Exception;

	Map eduScoreSearch(HttpServletRequest request, HttpServletResponse response) throws Exception;

	Map saveData(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
