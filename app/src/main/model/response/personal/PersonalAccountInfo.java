package response.personal;

import com.google.gson.annotations.SerializedName;

public class PersonalAccountInfo {

    /**
     * account_id : 1001
     * account : xxx
     * sex : 0
     * age : 0
     * email : xxx
     * phone :
     * head_url : xxx
     * email_status : -1
     * is_moderator : false
     * collected_num : 11
     * readed_num : 82910
     * is_follow : true
     */

    @SerializedName("account_id")
    private int accountId;
    @SerializedName("account")
    private String account;
    @SerializedName("sex")
    private int sex;
    @SerializedName("age")
    private int age;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("head_url")
    private String headUrl;
    @SerializedName("signature")
    private String signature;
    @SerializedName("personal_profile")
    private String personalProfile;
    @SerializedName("trade")
    private String trade;
    @SerializedName("education_institution")
    private String educationInstitution;
    @SerializedName("education")
    private String education;
    @SerializedName("home_address")
    private String homeAddress;
    @SerializedName("career")
    private String career;
    @SerializedName("email_status")
    private int emailStatus;
    @SerializedName("is_moderator")
    private boolean isModerator;
    @SerializedName("collected_num")
    private int collectedNum;
    @SerializedName("readed_num")
    private int readedNum;
    @SerializedName("is_follow")
    private boolean isFollow;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getEducationInstitution() {
        return educationInstitution;
    }

    public void setEducationInstitution(String educationInstitution) {
        this.educationInstitution = educationInstitution;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(int emailStatus) {
        this.emailStatus = emailStatus;
    }

    public int getCollectedNum() {
        return collectedNum;
    }

    public void setCollectedNum(int collectedNum) {
        this.collectedNum = collectedNum;
    }

    public int getReadedNum() {
        return readedNum;
    }

    public void setReadedNum(int readedNum) {
        this.readedNum = readedNum;
    }

    public boolean isModerator() {
        return isModerator;
    }

    public void setModerator(boolean moderator) {
        isModerator = moderator;
    }

    public boolean isFollow() {
        return isFollow;
    }

    public void setFollow(boolean follow) {
        isFollow = follow;
    }
}
