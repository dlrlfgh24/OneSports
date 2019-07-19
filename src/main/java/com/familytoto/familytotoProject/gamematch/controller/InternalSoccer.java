package com.familytoto.familytotoProject.gamematch.controller;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import com.familytoto.familytotoProject.gamematch.entitiy.MatchEntity;
import com.familytoto.familytotoProject.gamematch.service.GameMatchService;

public class InternalSoccer implements GameMatchService {
	private MatchEntity matchEntitiy = new MatchEntity();
	
	@Override
	public List<MatchEntity> getRecentGamesMatch(String toDate, String fromDate) {
		List list = new ArrayList<MatchEntity>();
		
	    URL url;
	    HttpURLConnection connection = null;
	    try {
	        // Create connection
	        url = new URL("https://sports.news.naver.com/kfootball/schedule/index.nhn?category=kleague");
	        connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("POST");
	        connection.setRequestProperty("Content-Type",
	                "application/x-www-form-urlencoded");
	 
	        //connection.setRequestProperty("Content-Length",
	        //        "" + Integer.toString(urlParameters.getBytes().length));
	        //connection.setRequestProperty("Content-Language", "en-US");
	 
	        connection.setUseCaches(false);
	        connection.setDoInput(true);
	        connection.setDoOutput(true);
	 
	        // Send request
	        DataOutputStream wr = new DataOutputStream(
	                connection.getOutputStream());
	        //wr.writeBytes(urlParameters);
	        wr.flush();
	        wr.close();
	 
	        // Get Response
	        InputStream is = connection.getInputStream();
	        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
	        String line;
	        StringBuffer response = new StringBuffer();
	        
	        while ((line = rd.readLine()) != null) {
	            response.append(line);
	            response.append('\r');
	        }
	        
	        System.out.println(response);
	        
	        matchEntitiy.setTeam1("test1");
	        matchEntitiy.setTeam2("test2");
	        matchEntitiy.setMovie("www.naver.com");
	        matchEntitiy.setAnal("www.naver.com/anal");
	        matchEntitiy.setTime("2300");
	        matchEntitiy.setDate("20121212");
	        
	        list.add(0, matchEntitiy);
	        
	        rd.close();
	        return list;
	    } catch (Exception e) {
	 
	        e.printStackTrace();
	        return null;
	 
	    } finally {
	 
	        if (connection != null) {
	            connection.disconnect();
	        }
	    }
	}
	
}
