package ar.com.buho.hbn.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
    private Long id;

    private String title;
    private Date date;
    private Set<Person> Participants = new HashSet();

    public Event() {}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	protected Set<Person> getParticipants() {
		return Participants;
	}

	protected void setParticipants(Set<Person> participants) {
		Participants = participants;
	}
    
	public void addParticipant(Person person) {
		this.getParticipants().add(person);
		person.getEvents().add(this);
	}
	
	public void removeParticipant(Person person) {
		this.getParticipants().remove(person);
		person.getEvents().remove(this);
	}
}
