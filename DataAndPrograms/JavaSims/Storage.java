/** Class is used for storing data from each iteration */public class Storage{    String time;	float MeanInflExp ;	float PublicForecastInflExp;	float stdDevInflExp;    float MeanInflExp_tm1  ;    float FractionUpdating;		/**Constructor;	 */	public Storage(){        time="";		MeanInflExp=0;		PublicForecastInflExp=0;		stdDevInflExp=0;        MeanInflExp_tm1=1.0f/0.0f;  // Not a number to prevent improper inclusion in regressions        FractionUpdating = 0;	}		public void setRun(int r){		time=Integer.toString(r);	}		public void setRun(String r){		time=r;	}	public String getRun(){		return time;	}			public void setMeanInflExp(float r){		MeanInflExp=r;	}		public float getMeanInflExp(){		return MeanInflExp;	}		public void setMeanInflExp_tm1(float r){		MeanInflExp_tm1=r;	}		public float getMeanInflExp_tm1(){		return MeanInflExp_tm1;	}		public void setPublicNewsForecast(float r){		PublicForecastInflExp=r;	}		public float getActual(){		return PublicForecastInflExp;	}		public void setSdev(float r){		stdDevInflExp=r;	}		public float getSdev(){		return stdDevInflExp;	}	public void setFractionUpdating(float r){		FractionUpdating=r;	}		public float getFractionUpdating(){		return FractionUpdating;	}}