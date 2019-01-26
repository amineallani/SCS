package com.mock.connection;

public enum Commands {
		  
		BUILD_REVISION("011BFC03010000"),
		RESET("01030C00"),
		GAP_DEVICE_INIT("0100FE260808000000000000000000000000000000000000000000000000000000000000000001000000"),
		CONN("0109FE0900000045FA520E6C54"), //01 09 FE 09 00 00 00 45 FA 52 0E 6C 54 
		CONN1("0109FE090000006901530E6C54"), // 69 01 53   
		DISC_SERVICES("0190FD020000"),
		DISC_SERVICES1("0190FD020100"), //01 90 FD 02 01 00                               
		READ_ACC("0192FD0600003F003802"), // 01 92 FD 06 00 00 3F 00 38 02
		READ_ACC11("018AFD0400003F00"), // 01 8A FD 04 00 00 3F 00        
		SCAN("0104FE03030100"),
		STOP_SCAN("0105FE00"),
		DiscAllCharDescs("0184FD06000001000001"),
		GATT_DiscAllChars("01B2FD06000001000001"),
		DiscAllCharDescs1("0184FD06010001000001"),
		GATT_DiscAllChars1("01B2FD06010001000001"),
		        
		
		CH("018AFD0400001100"),
		CH1("018AFD0400001E00"),
		CH4("018AFD0400003100"),
		CH14("018AFD040000410A"), //movement period
		
		CH2("0192FD0600001F000100"),  //enable notification
		CH3("0192FD050000330002"),  //barometere data 33 read calibration
		CH5("0192FD050000310000"), 
		CH6("0192FD050000330001"),  // barometer start measurments
		CH7("0192FD06000025000100"), //enable notif
		CH8("0192FD0600002D000100"), //enable notif
		CH9("0192FD06000027003802"), // Datacollection Raul Code
		
		CH10("0192FD0600003D000100"),
		CH11("0192FD0600004D000100"),
		CH12("0192FD0600003F003802"), //START DATA COLLECTION for Accelerometer 
		CH13("018AFD0400003F01"),
		CH15("0192FD0600003F003F02"),//I need to study why this is done after starting data collection .
			
		RUN("0192FD06000027008700"), 
		ACC("018AFD0400002700"),
		STOP("0192FD0600003F000000"),	
		CM34("0130FE03150600"),
		
		//TODO: this commands are temporary for test purposes I need to automatize the creation of command
		
		SH("018AFD0401001100"), //modified ??
		SH1("018AFD0401001E00"),
		SH4("018AFD0401003100"), //DONT KNOW IF THIS IS RIGHT
		
		SH2("0192FD0601001F000100"),  
		SH3("0192FD050100330002"),
		SH5("0192FD050100310000"), 
		SH6("0192FD050100330001"),  
		SH7("0192FD06010025000100"),
		SH8("0192FD0601002D000100"),
		SH9("0192FD06010027003802"), ///datacoll
		
		SH10("0192FD0601002F003802"), //dcol
		SH11("018AFD0401002F00"),
		SH12("0192FD0601003F003802"), //START DATA COLLECTION for Accelerometer 
		SH13("018AFD0401002700"), //I need to study why this is done after starting data collection .
		
		//Ex run
		//RUN("0192FD0600003F003802")
		       //     45FA52          

		
		RH("018AFD0400001100"),
		RH1("018AFD0400001E00"), 
		RH4("018AFD0400005100"),
		
		RH2("0192FD0600001F000100"),  
		RH3("0192FD050000530002"),
		RH5("0192FD050000510000"), 
		RH6("0192FD050000530001"),  
		RH7("0192FD0600002D000100"),
		RH8("0192FD06000035000100"),
		RH9("0192FD06000045000100"), // Datacollection Raul Code
		
		RH10("0192FD0600003D000100"),
		RH11("0192FD0600004D000100"),
		RH12("0192FD0600003F003802"), //START DATA COLLECTION for Accelerometer 
		RH13("018AFD0400003F00"),
		RH14("0192FD0600003F003F02");
		
		String val;
		Commands(String value)
		{
		 this.val=value;	
		}
		public String val()
		{
			return val;
		}
		
}

