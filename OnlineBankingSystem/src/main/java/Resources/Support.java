package Resources;

public class Support extends  Personalnformation {
    private String recipient;
    private String senderName;
    private String senderEmail;
    private String subject;
    private String message;

    public Support(String recipient, String senderName, String subject, String message) {
        this.recipient = recipient;
        this.senderName = senderName;
        this.subject = subject;
        this.message = message;
    }
    public String buildEmailBody() {
        StringBuilder emailBody = new StringBuilder();
        emailBody.append("Dear [Bank Name] Support Team,\n\n");
        emailBody.append("My name is ").append(senderName).append(".\n");
        if (!senderEmail.isEmpty()) {
            emailBody.append("My email address is ").append(senderEmail).append(".\n");
        }
        emailBody.append("I am writing to request support regarding ").append(subject).append(".\n\n");
        emailBody.append(message).append("\n\n");
        emailBody.append("Thank you for your time and assistance. I look forward to your response as soon as possible.\n\n");
        emailBody.append("Sincerely,\n");
        emailBody.append(senderName).append("\n");
        return emailBody.toString();
    }

    // Method to send email (implementation would depend on chosen library or service)
    public void sendEmail() {
        // Logic to send email using a Java email library (e.g., JavaMail) or external service API
        System.out.println("Email sent to " + recipient + " with subject: " + subject); // Placeholder for actual sending
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
