package chap09.part01;

public class Button {
	OnClickListner listner;
	

	public void setListner(OnClickListner listner) {
		this.listner = listner;
	}

	public void touch () {
		listner.onClick();
	}	
	
	static interface OnClickListner{
		void onClick();
	}

}
