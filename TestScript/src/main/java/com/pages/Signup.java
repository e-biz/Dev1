package com.pages;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	WebDriver driver;

	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, Signup.this);
	}
	private static final String Null = null;

	@FindBy(id = "ddlChooseApplication")
	WebElement SelecttheSignupCompany;
	
	@FindBy(id = "btnSubmit")
	WebElement letStartedAppBTN;

	@FindBy(id = "txtCompanyName")
	WebElement CN;

	@FindBy(id = "txtCompanyPhone")
	WebElement CP;

	@FindBy(id = "txtCompanyAddressLine1")
	WebElement CA1;

	@FindBy(id = "txtCompanyAddressLine2")
	WebElement CA2;

	@FindBy(id = "cboCompanyCountry")
	WebElement CCountry;

	@FindBy(id = "cboCompanyState")
	WebElement CS;

	@FindBy(id = "txtCompanyState")
	WebElement I_CS;

	@FindBy(id = "txtCompanyCity")
	WebElement CCity;

	@FindBy(id = "txtCompanyZipCode")
	WebElement CZ;

	@FindBy(xpath = "//input[@type = 'button' and @name ='next' and @value = 'Next']")
	List<WebElement> CompanyNextBTN;

	// ADMIN

	@FindBy(id = "txtContactPersonFirstName")
	WebElement CPN;

	@FindBy(id = "txtContactPersonPhone")
	WebElement CPPN;

	@FindBy(id = "txtAdminUserName")
	WebElement CPEmail;

	@FindBy(id = "txtAdminUserPassword")
	WebElement Pass;

	@FindBy(id = "txtAdminUserConfirmPassword")
	WebElement C_Pass;

	@FindBy(id = "btnAdmin")
	WebElement AdminNextBTN;

	@FindBy(xpath = "//button[@class = 'confirm btn btn-lg btn-primary']")
	WebElement VerifyEmailPopup;

	@FindBy(xpath = "//input[@class = 'form-control']")
	WebElement I_VerificationCode;

	@FindBy(xpath = "//button[@class = 'ajs-button ajs-ok']")
	WebElement VerifiedOkBTN;

	// SubscriptionInfo
	@FindBy(id = "ddlUserRate")
	WebElement UserSlabRate;

	@FindBy(id = "txtNoOfUsers")
	WebElement I_No_Ofusers;

	// Billing Information
	@FindBy(id = "chkBillingSameAsCompany")
	WebElement CHK_BillingInfo;

	@FindBy(id = "txtBillingCompanyName")
	WebElement BCN;

	@FindBy(id = "txtBillingPhone")
	WebElement BPN;

	@FindBy(id = "txtBillingEmail")
	WebElement BEmail;

	@FindBy(id = "txtBillingAddressLine1")
	WebElement BA1;

	@FindBy(id = "txtBillingAddressLine2")
	WebElement BA2;

	@FindBy(id = "cboBillingCountry")
	WebElement BCountry;

	@FindBy(id = "txtBillingCity")
	WebElement BCity;

	@FindBy(id = "cboBillingState")
	WebElement BS;

	@FindBy(id = "txtBillingZipCode")
	WebElement bZC;

	@FindBy(id = "txtBillingState")
	WebElement I_BState;

	// ACH

	@FindBy(id = "txtAccTitle")
	WebElement I_AccountTitle;

	@FindBy(id = "txtAccountNumber")
	WebElement I_AccountNo;

	@FindBy(id = "ddlAccountType")
	WebElement S_AccountType;

	@FindBy(id = "txtRoutingNumber")
	WebElement I_RoutingNo;

	@FindBy(id = "chkAgreement")
	WebElement CHK_Agrement;

	@FindBy(id = "btnSubmit")
	WebElement BTNCompleteSecureCheckout;

	// Summary Page

	// Company Verification
	@FindBy(id = "ContentPlaceHolder1_lblCompanyName")
	WebElement C_SCompanyName;

	@FindBy(id = "ContentPlaceHolder1_lblAddress")
	WebElement C_CSompanyAddress1;

	@FindBy(id = "ContentPlaceHolder1_lblAdress2")
	WebElement C_SCompanyAddress2;

	// Johnston Holt Associates, Other, Keller and Douglas Plc
	@FindBy(id = "ContentPlaceHolder1_lblCityStateZip")
	WebElement C_SCompanyCityStateZip;

	@FindBy(id = "ContentPlaceHolder1_lblCountry")
	WebElement C_SCompanyCountry;

	@FindBy(id = "ContentPlaceHolder1_lblPhone")
	WebElement C_SCompanyPhoneNo;

	// Admin Verification
	@FindBy(id = "ContentPlaceHolder1_lblAdminName")
	WebElement C_SAdminName;

	@FindBy(id = "ContentPlaceHolder1_lblContactNumber")
	WebElement C_SAdminPhoneNo;

	@FindBy(id = "ContentPlaceHolder1_lblEmail")
	WebElement C_SAdminEmail;

	// Billing Verification
	@FindBy(id = "ContentPlaceHolder1_lblBillingCompanyName")
	WebElement C_SbillingCompanyName;

	@FindBy(id = "ContentPlaceHolder1_lblbillingAddress")
	WebElement C_SBillingAddress1;

	@FindBy(id = "ContentPlaceHolder1_lblBillingAdress2")
	WebElement C_SBillingAddress2;

	@FindBy(id = "ContentPlaceHolder1_lblBillingCityStateZip")
	WebElement C_SBillingStateCityZip;

	@FindBy(id = "ContentPlaceHolder1_lblBillingCountry")
	WebElement C_SBillingCountry;

	@FindBy(id = "ContentPlaceHolder1_lblBillingPhone")
	WebElement C_SBillingPhoneNo;

	@FindBy(id = "ContentPlaceHolder1_lblBillingEmail")
	WebElement C_SBillingEmail;

	// ACH Verification
	
	@FindBy(id = "ContentPlaceHolder1_lblPaymentHeading")
	WebElement HeadingofPaymentInfo;
	
	@FindBy(id = "ContentPlaceHolder1_lblCCName")
	WebElement C_SACHName;

	// ********1221
	@FindBy(id = "ContentPlaceHolder1_lblCCNumber")
	WebElement C_SAccountNo;
	

	// ****9593
	@FindBy(id = "ContentPlaceHolder1_lblExpiryDate")
	WebElement C_SRoutingNO;

	@FindBy(id = "//span[@id = 'ContentPlaceHolder1_lblOrderSummary']//strong")
	List<WebElement> C_STotalNoOfUsers;

	@FindBy(id = "ContentPlaceHolder1_txtTotalAmount")
	WebElement C_STotalAmount;

	@FindBy(id = "ContentPlaceHolder1_btnPlaceOrder")
	WebElement PlaceOrderBTN;

	@FindBy(id = "chkUnderstand")
	WebElement CHK_IUnderstand;
	
	

	// THANKYOU PAGE VERIFICATION
	@FindBy(id = "lblCompanyName")
	WebElement C_CN;

	@FindBy(id = "lblAddress")
	WebElement C_AD1;

	@FindBy(id = "lblAddress2")
	WebElement C_AD2;

	@FindBy(id = "lblCityStateZip")
	WebElement C_CityStateZip;

	@FindBy(id = "lblCountry")
	WebElement C_C;

	@FindBy(id = "lblPhone")
	WebElement C_PN;

	@FindBy(id = "lblAdminName")
	WebElement CAN;

	@FindBy(id = "lblContactNumber")
	WebElement C_ACN;

	@FindBy(id = "lblEmail")
	WebElement CE;
	
	@FindBy(id = "btnGetStartedLogin")
	WebElement GetStarted;
	
	
	//<--------------Select Application TXO/TRX/STD------------>
	public void SelectTheTrxLinkApplication(String ApplicationName) {
		Select AppName = new Select(SelecttheSignupCompany);
		if (ApplicationName.equals("Intuit QuickBooks� Online")) {
			AppName.selectByValue("1");
			letStartedAppBTN.click();
			System.out.println("Creating the TXO Online Company");
		} else if (ApplicationName.equals("Intuit QuickBooks� Desktop")) {
			AppName.selectByValue("2");
			letStartedAppBTN.click();
			System.out.println("Creating the TRX Desktop Company");
		} else if (ApplicationName.equals("Standalone Company")) {
			AppName.selectByValue("3");
			letStartedAppBTN.click();
			System.out.println("Creating the Standalone Company Company");
		} else {
			System.out.println("Please Select the Right Application");
		}
	}

	
	//<--------------Filled The Company Information------------>
	public void FilledtheCompanyInformationPage(String CompanyName, String PhoneNo, String Address1, String Address2,
			String Country, String State, String NewState, String City, String ZipCode) {
		try {
			CN.sendKeys(CompanyName);
			CP.sendKeys(PhoneNo);
			CA1.sendKeys(Address1);
			if (Address2 == Null) {
			} else {
				CA2.sendKeys(Address2);
			}
			Select CNT = new Select(CCountry);
			CNT.selectByVisibleText(Country);
			Thread.sleep(2000);
			Select CST = new Select(CS);

			if (NewState  == Null) {
				CST.selectByVisibleText(State);
			} else {
				CST.selectByVisibleText(NewState);
				Thread.sleep(1000);
				I_CS.sendKeys(State);
			}

			CCity.sendKeys(City);
			CZ.sendKeys(ZipCode);
			CompanyNextBTN.get(0).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	//<--------------Filled The Administration Information------------>
	public void FilledAdminTabInformation(String ContactPersonName, String ContactPersonPhoneNo,
			String ContactPersonEmail) throws InterruptedException {
		Thread.sleep(2000);
		CPN.sendKeys(ContactPersonName);
		CPPN.sendKeys(ContactPersonPhoneNo);
		CPEmail.sendKeys(ContactPersonEmail);
		Pass.sendKeys("Aa1234567");
		C_Pass.sendKeys("Aa1234567");
		AdminNextBTN.click();
		Thread.sleep(1000);
		VerifyEmailPopup.click();
		Thread.sleep(7000);
		String Code;
		System.out.println("Enter the Code which is send to your Email");
		@SuppressWarnings("resource")
		Scanner Codeinput = new Scanner(System.in);
		Code = Codeinput.nextLine();
		Thread.sleep(2000);
		I_VerificationCode.sendKeys(Code);
		VerifyEmailPopup.click();
		Thread.sleep(1000);
		VerifiedOkBTN.click();
	}
	
	//<--------------Filled The Billing Information------------>
	public void FilledBillingInformation(String BillingCompanyName, String PhoneNo, String Address1, String Address2,
			String Country, String State, String NewState, String City, String ZipCode,String BillingEmail) {

		try {
			Thread.sleep(2000);
			BCN.sendKeys(BillingCompanyName);
			BPN.sendKeys(PhoneNo);
			BEmail.sendKeys(BillingEmail);
			BA1.sendKeys(Address1);
			if (Address2 == Null) {
			} else {
				BA2.sendKeys(Address2);
			}
			Select CNT = new Select(BCountry);
			CNT.selectByVisibleText(Country);
			Thread.sleep(2000);
			Select CST = new Select(BS);

			if (NewState == Null) {
				CST.selectByVisibleText(State);
			} else {
				CST.selectByVisibleText(NewState);
				Thread.sleep(1000);
				I_BState.sendKeys(State);
			}

			BCity.sendKeys(City);
			bZC.sendKeys(ZipCode);
			CompanyNextBTN.get(3).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	//<--------------Filled The Billing Information By Checked------------>
	public void FilledBillingInfoAsSameasCompanyInformation() throws InterruptedException {
		Thread.sleep(2000);
		CHK_BillingInfo.click();
	}
	
	//<--------------Filled The Subscription Information TXO------------>
	public void FilledTXOSubscriptionInformation(String Value, String I_No_Of_users)
			throws InterruptedException {
		Thread.sleep(2000);
		Select USR = new Select(UserSlabRate);
		int vl = Integer.parseInt(Value);
		String str1 = Integer.toString(vl);
		if (vl >= 27 && vl <= 37) {
			if (vl == 27) {
				USR.selectByValue(str1);
				Thread.sleep(1000);
				String user = I_No_Of_users;
				I_No_Ofusers.sendKeys(user);
				System.out.println(UserSlabRate.getText() + " And No of User is : " + I_No_Of_users);
				Thread.sleep(2000);
				CompanyNextBTN.get(2).click();

			} else {
				USR.selectByValue(str1);
				System.out.println(UserSlabRate.getText());
				Thread.sleep(2000);
				CompanyNextBTN.get(2).click();
			}
		} else {
			System.out.println("Please select the Correct Value to Select the UsersSlabsRate");
		}
	}
	
	//<--------------Filled The ACH Information------------>
	public void FilledACHInfo(String TitleName, String AccountNo, String AccountType, String RoutingNo)
			throws InterruptedException {
		Thread.sleep(1000);
		I_AccountTitle.sendKeys(TitleName);
		I_AccountNo.sendKeys(AccountNo);
		Select ATY = new Select(S_AccountType);
		ATY.selectByValue(AccountType);
		I_RoutingNo.sendKeys(RoutingNo);
		CHK_Agrement.click();
		Thread.sleep(1000);
		BTNCompleteSecureCheckout.click();

	}
	
/*
	//<--------------Verification of Company Information------------>
	public void VerificationofCompanyInformationFromSummaryPage(String C_CompanyName, String C_CompanyAddress,
			String C_CompanyAddress2, String C_CompanyCityStateZip, String C_CompanyCountry, String C_CompanyPhoneNo) throws InterruptedException {
		Thread.sleep(6000);
		Object driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Reporter.log("----------------------------------------------------");
		Reporter.log("-----Company Information Verification Stating-------");
		Reporter.log("----------------------------------------------------");
		String V_CN = C_SCompanyName.getText();
		String V_CA1 = C_CSompanyAddress1.getText();
		// if else checking
		
		String V_CSZ = C_SCompanyCityStateZip.getText();
		String V_CC = C_SCompanyCountry.getText();
		String V_PN = C_SCompanyPhoneNo.getText();
		Assert.assertEquals(V_CN, C_CompanyName, "Company Name is Not Correct /n Accutal Company Name is : " + V_CN
					+ " and Expected Company Name is : " + C_CompanyName);
		Assert.assertEquals(V_CA1, C_CompanyAddress,"Address 01 is Not Correct /n Accutal Address 01 is : " + V_CA1
				+ " and Expected Address 01 is : " + C_CompanyAddress);
		if (C_CompanyAddress2 == Null) {
		} else {
			String V_CA2 = C_SCompanyAddress2.getText();
			Assert.assertEquals(V_CA2, C_CompanyAddress2,"Address 02 is Not Correct /n Accutal Address 02 is : " + V_CA2
					+ " and Expected Address 02 is : " + C_CompanyAddress2);
		}
		Assert.assertEquals(V_CSZ, C_CompanyCityStateZip,"CityStateZip is Not Correct /n Accutal CityStateZip is : " + V_CSZ
				+ " and Expected CityStateZip is : " + C_CompanyCityStateZip);
		Assert.assertEquals(V_CC, C_CompanyCountry,"Country is Not Correct /n Accutal Country is : " + V_CC + " and Expected Country is : "
				+ C_CompanyCountry);
		Assert.assertEquals(V_PN, C_CompanyPhoneNo,"PhoneNo is Not Correct /n Accutal PhoneNo is : " + V_PN + " and Expected PhoneNo is : "
				+ C_CompanyPhoneNo);
		Reporter.log("----------------------------------------------------");
		Reporter.log("--------Company Information Verification End--------");
		Reporter.log("----------------------------------------------------");
	}

	//<--------------Verification of Admin Information------------>
	public void VerificationofAdminInformationFromSummaryPage(String C_AdminName,
			String C_AdminPhoneNo, String C_AdminEmail) {
		Reporter.log("----------------------------------------------------");
		Reporter.log("-------Admin Information Verification Stating-------");
		Reporter.log("----------------------------------------------------");
		String V_AN = C_SAdminName.getText();
		String V_APN = C_SAdminPhoneNo.getText();
		String V_AEmail = C_SAdminEmail.getText();
		
		Assert.assertEquals(V_AN, C_AdminName,"Admin Email is Not Correct /n Accutal Admin Email is : " + V_AN
				+ " and Expected Admin Email is : " + C_AdminName);
		Assert.assertEquals(V_APN, C_AdminPhoneNo,"Admin PhoneNo is Not Correct /n Accutal Admin PhoneNo is : " + V_APN + " and Expected Admin PhoneNo is : "
				+ C_AdminPhoneNo);
		Assert.assertEquals(V_AEmail, C_AdminEmail,"Admin Email is Not Correct /n Accutal Admin Email is : " + V_AEmail + " and Expected Admin Email is : "
				+ C_AdminEmail);
		Reporter.log("----------------------------------------------------");
		Reporter.log("-------Admin Information Verification End------------");
		Reporter.log("----------------------------------------------------");
	}
	
	//<--------------Verification of Billing Information------------>
	public void VerificationofBillingInformationFromSummaryPage( String C_BillingCompanyName, String C_BillingAddress1,
			String C_BillingAddress2, String C_BillingCityStateZip, String C_BillingCountry, String B_BillingphoneNo,
			String C_BilingEmail) {
		
		Reporter.log("----------------------------------------------------");
		Reporter.log("-----Billing Information Verification Starting------");
		Reporter.log("----------------------------------------------------");
		String V_BCN = C_SbillingCompanyName.getText();
		String V_BA1 = C_SBillingAddress1.getText();
		String V_BSCZ = C_SBillingStateCityZip.getText();
		String V_BC = C_SBillingCountry.getText();
		String V_BPN = C_SBillingPhoneNo.getText();
		String V_BEmail = C_SBillingEmail.getText();
		
		
		Assert.assertEquals(V_BCN, C_BillingCompanyName,"Company Name is Not Correct /n Accutal Company Name is : " + V_BCN
				+ " and Expected Company Name is : " + C_BillingCompanyName);
		Assert.assertEquals(V_BA1, C_BillingAddress1,"Address 01 is Not Correct /n Accutal Address 01 is : " + V_BA1
				+ " and Expected Address 01 is : " + C_BillingAddress1);
		if(C_BillingAddress2 == Null) {
		}else {
			String V_BA2 = C_SBillingAddress2.getText();
			Assert.assertEquals(V_BA2, C_BillingAddress2,"Address 02 is Not Correct /n Accutal Address 02 is : " + V_BA2
					+ " and Expected Address 02 is : " + C_BillingAddress2);}
		Assert.assertEquals(V_BSCZ, C_BillingCityStateZip,"CityStateZip is Not Correct /n Accutal CityStateZip is : " + V_BSCZ
				+ " and Expected CityStateZip is : " + C_BillingCityStateZip);
		Assert.assertEquals(V_BC, C_BillingCountry,"Country is Not Correct /n Accutal Country is : " + V_BC + " and Expected Country is : "
				+ C_BillingCountry);
		Assert.assertEquals(V_BPN, B_BillingphoneNo,"PhoneNo is Not Correct /n Accutal PhoneNo is : " + V_BPN + " and Expected PhoneNo is : "
				+ B_BillingphoneNo);
		Assert.assertEquals(V_BEmail, C_BilingEmail,"Billing Email is Not Correct /n Accutal Billing Email is : " + V_BEmail + " and Expected Billing Email is : "
				+ C_BilingEmail);
		Reporter.log("----------------------------------------------------");
		Reporter.log("------Billing Information Verification End----------");
		Reporter.log("----------------------------------------------------");
	}

	//<--------------Verification of Payment Information------------>
	public void VerificationofPaymentInformationFromSummaryPage(String C_ACHName, String C_ACHANo, String C_ACHRNo) {
		String V_HOPI = HeadingofPaymentInfo.getText();
		
		Reporter.log("----------------------------------------------------");
		Reporter.log("------Payment Information Verification Starting-----");
		Reporter.log("----------------------------------------------------");
		String V_ACHN = C_SACHName.getText();
		String V_ACHNO = C_SAccountNo.getText();
		String V_ACHRNO = C_SRoutingNO.getText();
		if(V_HOPI.equals("ACH")) {
			Assert.assertEquals(V_ACHN, C_ACHName,"ACH Name is Not Correct /n Accutal ACH Name is : " + V_ACHN
						+ " and Expected ACH Name is : " + C_ACHName);
			Assert.assertEquals(V_ACHNO, C_ACHANo,"ACH Account No is Not Correct /n Accutal ACH Account No is : " + V_ACHNO
						+ " and Expected ACH Account No is : " + C_ACHANo);
			Assert.assertEquals(V_ACHRNO, C_ACHRNo);
		}
		else {
			Assert.fail("Payment Type is InCorrect");
		}
		Reporter.log("----------------------------------------------------");
		Reporter.log("-------Payment Information Verification End---------");
		Reporter.log("----------------------------------------------------");
		
	}
	
	//<--------------Verification of Subscription Information------------>
	public void VerificationofSubscriptionInformationFromSummaryPage(String C_NoofUsers, String C_TotalAmount) {
		Reporter.log("----------------------------------------------------");
		Reporter.log("------Payment Information Verification Starting------");
		Reporter.log("----------------------------------------------------");
		String V_TA = C_STotalAmount.getText();

		for (int i = 0; i < C_STotalNoOfUsers.size(); i++) {
			String v = C_STotalNoOfUsers.get(i).getText();
			if (v.length() <= 2) {
				Assert.assertEquals(v, C_NoofUsers,"TotalNo of Users is Not Correct /n Accutal TotalNo of Users is : " + v
							+ " and Expected TotalNo of Users is : " + C_NoofUsers);
			} else if (v.length() >= 3) {
				Assert.assertEquals(v, C_TotalAmount);
			} else {
				Assert.fail("issues in VerificationofSubscriptionInformationFromSummaryPage Method");
			}
		}
		Assert.assertEquals(V_TA, C_TotalAmount);
		Reporter.log("----------------------------------------------------");
		Reporter.log("-------Payment Information Verification Ending------");
		Reporter.log("----------------------------------------------------");

	}

	//<--------------Click On Place Order Button------------>
	public void C_PlaceOrderBTN() throws InterruptedException {
		CHK_IUnderstand.click();
		Thread.sleep(2000);
		PlaceOrderBTN.click();
	}

	//<--------------Verification of Thankyou Page Information------------>
	public void VerificationOfAllDataofThankyouPage(String CompanyName,String Address1, String Address2, String CityStateZip,String Country,String PhoneNO,
			String AdminName,String AdminContactNO, String AdminEmail) {
		Reporter.log("----------------------------------------------------");
		Reporter.log("---------Thankyou page Verification Starting--------");
		Reporter.log("----------------------------------------------------");
		String V_CN = C_CN.getText();
		String V_AD1 = C_AD1.getText();
		String V_CSZ = C_CityStateZip.getText();
		String V_C = C_C.getText();
		String V_PN = C_PN.getText();
		String V_AN = CAN.getText();
		String V_APN = C_ACN.getText();
		String V_AE = CE.getText();
		
		Assert.assertEquals(V_CN, CompanyName,"Company Name is Not Correct /n Accutal Company Name is : " + V_CN
					+ " and Expected Company Name is : " + CompanyName);
		Assert.assertEquals(V_AD1, Address1);
		if(Address2 == Null) {
		}else {
			String V_AD2 = C_AD2.getText();
			Assert.assertEquals(V_AD2, Address2,"Address 02 is Not Correct /n Accutal Address 02 is : " + V_AD2
						+ " and Expected Address 02 is : " + Address2);
		}
		Assert.assertEquals(V_CSZ, CityStateZip,"Company CityStateZip is Not Correct /n Accutal Company CityStateZip is : " + V_CSZ
				+ " and Expected Company CityStateZip is : " + CityStateZip);
		
		Assert.assertEquals(V_C, Country,"Company Country is Not Correct /n Accutal Company Country is : " + V_C
				+ " and Expected Company Country is : " + Country);
		Assert.assertEquals(V_PN, PhoneNO,"Company PhoneNO is Not Correct /n Accutal Company PhoneNO is : " + V_PN
				+ " and Expected Company PhoneNO is : " + PhoneNO);
		Assert.assertEquals(V_AN, AdminName,"Admin Email is Not Correct /n Accutal Admin Email is : " + V_AN
				+ " and Expected Admin Email is : " + AdminName);
		Assert.assertEquals(V_APN, AdminContactNO,"Admin PhoneNo is Not Correct /n Accutal Admin PhoneNo is : " + V_APN + " and Expected Admin PhoneNo is : "
					+ AdminContactNO);
		Assert.assertEquals(V_AE, AdminEmail);
		Reporter.log("----------------------------------------------------");
		Reporter.log("------Thankyou page Verification Ending-------------");
		Reporter.log("----------------------------------------------------");
		
	}


	public void ClickOnTheGetStartedButton() throws InterruptedException {
		Thread.sleep(2000);
		GetStarted.click();
	}

*/


}





