public class Email extends Messege {
    private String recipient;
    private String topic;
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public Email(String recipient, String topic) {
        this.recipient = recipient;
        this.topic = topic;
    }
    public Email(String txt, String recipient, String topic) {
        super(txt);
        this.recipient = recipient;
        this.topic = topic;
    }
    public void send(){
        System.out.println(this.recipient+ " "+this.topic+" "+ super.text);

    }
    

    
}
