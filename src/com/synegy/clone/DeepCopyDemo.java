package com.synegy.clone;

public class DeepCopyDemo {

}

class Session implements Cloneable {

	int sessionId;
	String description;

	public Session(int sessionId, String description) {
		super();
		this.sessionId = sessionId;
		this.description = description;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class Trainer implements Cloneable {

	int trainerId;
	String name;
	Session session;

	public Trainer(int trainerId, String name, Session session) {
		super();
		this.trainerId = trainerId;
		this.name = name;
		this.session = session;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Session sessionClone = (Session) session.clone();

		Trainer trainer = (Trainer) super.clone();
		trainer.session = sessionClone;

		return trainer;
	}

}
