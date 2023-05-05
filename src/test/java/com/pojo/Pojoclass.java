package com.pojo;





import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

//import lombok.experimental.FieldDefaults;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Pojoclass extends BaseClass{
	
	public Pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='internal slackcart Associate']")
	public WebElement login;
	
	@FindBy(xpath = "//span[text()='Login using e-mail and password']")
	public WebElement loginchangeclick;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	public WebElement loginclick;
	
	@FindBy(xpath = "//span[text()='Studio']")
	public WebElement studio;
	
	@FindBy(xpath = "//span[text()='GO HOME']")
	public WebElement gohome;
	
	@FindBy(xpath = "//span[text()='Create new App']")
	public WebElement creatnew;
	
	@FindBy(xpath = "//div[@class='ant-modal-content']")
	public WebElement dialoguebox;
	
	@FindBy(xpath = "//span[text()='Create App']")
	public WebElement createappbtn;

   @FindBy(xpath = "//span[text()='An app already exists with the same name. Please create an app with a different name.']")
   public WebElement appnameerrormsg;
	
	@FindBy(xpath = "//input[@placeholder='Untitled App']")
	public WebElement untitledapp;
	
	@FindBy(xpath = "//*[@name='description']")
	public WebElement appdescription;
	 
	@FindBy(xpath = "//span[text()='There was an error while creating the app']")
	public WebElement msg1;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement cancelbtn;
	
	@FindBy(xpath = "//span[@class='css-1mm0mgn']")
	public WebElement appcount;
	
	@FindBy(xpath = "//span[text()='New Process']")
	public WebElement clickaddprocess;
	
	@FindBy(xpath = "//span[text()='There was an error while creating the process']")
	public WebElement processnameerror;
	
	@FindBy(xpath = "//div[text()='Add a new process']")
	public WebElement clicknewprocess;
	
	@FindBy(xpath = "//div[text()='Import process from JSON']")
	public WebElement importjson;
	
	@FindBy(xpath = "//div[@class='ant-modal-content']")
	public WebElement addprocessdialoguebox;
	
	@FindBy(xpath = "//input[@placeholder='Untitled Process']")
	public WebElement processname1;
	
	@FindBy(xpath = "//textarea[@placeholder='Optionally, enter a short description for your process...']")
	public WebElement processdscription1;
	
    @FindBy(xpath = "//span[text()='Add Process']")
    public WebElement clickproc10;
    
    @FindBy(xpath = "//span[text()='Process name is mandatory']")
    public WebElement processnamemsg;

    @FindBy(xpath = "//span[text()='There was an error while creating the process']")
    public WebElement alertmsg1;
    
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement click3dot;
    
    @FindBy(xpath = "//ul[@role='menu']")
    public WebElement drop3dot;
    
    @FindBy(xpath = "//div[text()='Delete App']")
    public WebElement deleteapp;
    
    @FindBy(xpath = "//span[text()='Delete App?']")
    public WebElement deleteappdialogbox;
    
    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement canceldeleteapp;
    
    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement btndeleteapp;
    
   @FindBy(xpath = "//span[text()='Lane']")
   public WebElement swimlane;
    
   @FindBy(xpath = "//div[@class='react-flow__pane react-flow__container']")
   public WebElement studiopage;
    
   @FindBy(xpath = "//input[@name='name']")
   public WebElement swimename1;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement saveswim;
   
   @FindBy(xpath = "//span[text()='Add Swimlane']")
   public WebElement swimlanepopup;
   
   @FindBy(xpath = "//span[text()='Swimlane configuration']")
   public WebElement swimconfig;
   
   @FindBy(xpath = "//span[text()='Cancel']")
   public WebElement cancelswim;
   
   @FindBy(xpath = "//span[text()='Step']")
   public WebElement step;
   
   @FindBy(xpath = "(//span[text()='Add Step'])[2]")
   public WebElement steppopup1;
    
   @FindBy(xpath = "//div[@class='css-1mw8kxx-Stack']")
   public WebElement stepadd1;
   
   @FindBy(xpath = "//div[@class='css-15xba56-Stack']")
   public WebElement stepadd2;
   
      @FindBy(xpath = "(//span[text()='Add Step'])[1]")
   public WebElement addstepswim1;
   
   @FindBy(xpath = "//span[text()='Step configuration']")
   public WebElement stepconfiguration;
   
   @FindBy(xpath = "//span[text()='Required']")
   public WebElement alertmsgstepname1;   
   
   @FindBy(xpath = "//input[@name='name']")
   public WebElement stepname;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement savestep;
   
   @FindBy(xpath = "//span[text()='Cancel']")
   public WebElement cancelstep1;
   
   @FindBy(xpath = "//span[text()='STEP']")
   public WebElement createdstep1;
   
   @FindBy(xpath = "//span[text()='Add Step']")
   public WebElement addsteppp1;
     
   @FindBy(xpath = "//span[text()='Field']")
   public WebElement field;
   
   @FindBy(xpath = "//span[text()='All']")
   public WebElement selectallinfield;
   
   @FindBy(xpath = "//span[text()='All']")
   public WebElement selectall;
   
   @FindBy(xpath = "//div[@class='css-tcueus-Stack']")
   public WebElement addfield;
   
   @FindBy(xpath = "//span[text()='Array']")
   public WebElement arrayfield;
   
   @FindBy(xpath = "//input[@placeholder='Fields']")
   public WebElement fieldsearch;
   
   @FindBy(xpath = "//span[text()='Add Field']")
   public WebElement addfieldbtn;
   
   @FindBy(xpath = "//span[text()='Add Field']")
   public WebElement fieldpopup;
   
   @FindBy(xpath = "//span[text()='Cancel']")
   public WebElement cancelfield1;
   
   @FindBy(xpath = "//span[text()='Boolean']")
   public WebElement booleanfield;
   
   @FindBy(xpath = "//span[text()='Field configuration']")
   public WebElement fieldconfiguration;
   
   @FindBy(xpath = "(//input[@type='text'])[1]")
   public WebElement fieldname1;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement savefield1;
   
   @FindBy(xpath = "//span[text()='Required']")
   public WebElement namefieldvalidationmsg;
   
   @FindBy(xpath = "//span[text()='boolean']")
   public WebElement fieldboolean;
   
   @FindBy(xpath = "(//div[@class='css-17f6sgf-Stack'])[1]")
   public WebElement fieldconfig1;
   
   @FindBy(xpath = "(//span[@class='css-xc1ncn'])[2]")
   public WebElement clickcancelfieldsearch;
   
   @FindBy(xpath = "//span[text()='Save']")
   public WebElement saveprocessinstudio1;
   
   @FindBy(xpath = "//span[text()='Save Process']")
   public WebElement savepopup1;
   
   @FindBy(xpath = "//span[@aria-label='CloudCheck']")
   public WebElement hovertosavedclud;
   
   @FindBy(xpath = "//div[text()='All changes have been saved']")
   public WebElement savedmsg;
   
   @FindBy(xpath = "//span[text()='Submit']")
   public WebElement submitbtn;
   
   @FindBy(xpath = "(//span[text()='Edit'])[2]")
   public WebElement editbtn;
   
   @FindBy(xpath = "(//span[text()='Edit'])[1]")
   public WebElement onscreeneditbtn;
   
   @FindBy(xpath = "(//button[@type='button'])[1]")
   public WebElement navigattoprocesslandingpage1;
   
   @FindBy(xpath = "//span[text()='Deploy']")
   public WebElement deploy;
   
   @FindBy(xpath = "//span[text()='Deployment']")
   public WebElement deploydialogbox;
   
   @FindBy(xpath = "//textarea[@placeholder='Summary of items covered in this deployment']")
   public WebElement deploydescription;
   
   @FindBy(xpath = "//span[text()='Save & Deploy']")
   public WebElement clicksaveanddeploy;
   
   @FindBy(xpath = "//input[@role='combobox']")
   public WebElement clickfielddropdown;
   
   @FindBy(xpath = "//span[@class='css-157nmas']")
   public WebElement dropdowndataset;
   
  @FindBy(xpath = "//span[@class='css-157nmas']")
   //@FindBy(xpath = "//div[text()='Common Field Types']//following::span[@class='css-157nmas']")
   public List<WebElement> dataset1;
  
  @FindBy(xpath = "//div[@class='css-1bp6sxd-Stack']")
  public WebElement verifyfield1;
   
  @FindBy(xpath = "//span[text()='Add Field']")
  public WebElement clickaddfield;
  
  @FindBy(xpath = "//span[text()='Required']")
  public WebElement fieldnamealert;
  
   //Xpath for fields in field configuration screen
  @FindBy(xpath = "//span[text()='Boolean']")
  public WebElement boolean1;
  
  @FindBy(xpath = "//span[text()='Char']")
  public WebElement char1;
   
   @FindBy(xpath = "//span[text()='Checkbox']")
   public WebElement checkbox;
   
   @FindBy(xpath = "//span[text()='Date']")
   public WebElement date;
   
   @FindBy(xpath = "//span[text()='Dropdown (Single)']")
   public WebElement dropdownsingle;
   
   @FindBy(xpath = "//span[text()='Email']")
   public WebElement email;
   
   @FindBy(xpath = "//span[text()='Number (decimal)']")
   public WebElement numberdecimal;
   
   @FindBy(xpath = "//span[text()='Number (integer)']")
   public WebElement numberinteger;
   
   @FindBy(xpath = "//span[text()='Paragraph / Heading']")
   public WebElement paragraph;
   
   @FindBy(xpath = "//span[text()='Phone']")
   public WebElement phone;
   
   @FindBy(xpath = "//span[text()='Radio']")
   public WebElement radio;
   
   @FindBy(xpath = "(//span[text()='Free Text'])[1]")
   public WebElement freetext;
   
   @FindBy(xpath = "//span[text()='URL']")
   public WebElement url;
   
   @FindBy(xpath = "//span[text()='Array']")
   public WebElement array;
   
   @FindBy(xpath = "//span[text()='Business Unit']")
   public WebElement businessunit;
   
   @FindBy(xpath = "//span[text()='Cascader']")
   public WebElement cascader;
   
   @FindBy(xpath = "//span[text()='Currency']")
   public WebElement currency;
   
   @FindBy(xpath = "//span[text()='Date (timezone aware)']")
   public WebElement datetimezone;
   
   @FindBy(xpath = "//span[text()='Download Attachment']")
   public WebElement downloadattachment;
   
   @FindBy(xpath = "//span[text()='Dropdown (Multi)']")
   public WebElement dropdownmulti;
   
   @FindBy(xpath = "//span[text()='Dynamic Group JSON']")
   public WebElement dynamicgroupjson;
   
   @FindBy(xpath = "//span[text()='Embed Video']")
   public WebElement embedvideo;
   
   @FindBy(xpath = "//span[text()='Google Address Search']")
   public WebElement googleaddresssearch;
   
   @FindBy(xpath = "//span[text()='Grouped Checkbox']")
   public WebElement groupedcheckbox;
   
   @FindBy(xpath = "//span[text()='Info/Description Box']")
   public WebElement infodescriptionbox;
   
   @FindBy(xpath = "//span[text()='JSON Code']")
   public WebElement jsoncode;
   
   @FindBy(xpath = "//span[text()='PDF Link']")
   public WebElement pdflink;
   
   @FindBy(xpath = "//span[text()='Process Linking (alpha feature)']")
   public WebElement processlinking;
   
   @FindBy(xpath = "//span[text()='Region']")
   public WebElement region;
   
   @FindBy(xpath = "//span[text()='Rich Text Editor']")
   public WebElement richtexteditor;
   
   @FindBy(xpath = "//span[text()='Section line']")
   public WebElement sectionlink;
   
   @FindBy(xpath = "//span[text()='Slider']")
   public WebElement slider;
   
   @FindBy(xpath = "//span[text()='Supplier Creation']")
   public WebElement suppliercreation;
   
   @FindBy(xpath = "//span[text()='System Field']")
   public WebElement systemfield;
   
   @FindBy(xpath = "//span[text()='Table']")
   public WebElement table;
   
   @FindBy(xpath = "//span[text()='Upload File']")
   public WebElement uploadfile;
   
   @FindBy(xpath = "//span[text()='Multi File Upload']")
   public WebElement multifileupload;
   
   @FindBy(xpath = "//span[text()='Visualization']")
   public WebElement visualization;
   
   @FindBy(xpath = "//span[text()='Horizontal Space']")
   public WebElement horizontalspace;
   
   @FindBy(xpath = "//span[text()='Wizard Section']")
   public WebElement wizardsection;
   
   @FindBy(xpath = "//span[text()='Word Document Download']")
   public WebElement worddocumentdownload;
   
   @FindBy(xpath = "//span[text()='PDF Viewer']")
   public WebElement pdfviewer;
   
   @FindBy(xpath = "//span[text()='Integration Fields']")
   public WebElement integrationfields;
   
   @FindBy(xpath = "//span[text()='Add option']")
   public WebElement checkboxaddoption;
 
   @FindBy(xpath = "//span[text()='Add Option']")
   public WebElement checkboxaddoptionpopup1;
   
   @FindBy(xpath = "//input[@name='label']")
   public WebElement checkboxaddoptionlable1; 
 
   @FindBy(xpath = "//input[@name='value']")
   public WebElement checkboxaddoptionvalue1;
   
   @FindBy(xpath = "//span[text()='Add']")
   public WebElement addbuttonforcheckboxaddoption;
   
   @FindBy(xpath = "//span[text()='Add option']")
   public WebElement cascaderaddoptionclick1;
   
   @FindBy(xpath = "//span[text()='Add Option']")
   public WebElement addoptionpopupforcascader1;
   
   @FindBy(xpath = "//input[@name='label']")
   public WebElement cascaderaddoptionlable;
   
   @FindBy(xpath = "//input[@name='value']")
   public WebElement cascaderaddoptionvalue;
   
   @FindBy(xpath = "//input[@id='rc_select_9']")
   public WebElement cascaderaddoptionparent;
   
   @FindBy(xpath = "//span[text()='Add']")
   public WebElement cascaderaddoptionaddbutton;
   
   @FindBy(xpath = "(//span[text()='Required'])[1]")
   public WebElement namealertforsystemfield;
   
   @FindBy(xpath = "(//span[text()='Required'])[2]")
   public WebElement sourcemappingalertforsystemfield;
   
   @FindBy(xpath = "//input[@id='rc_select_24']")
   public WebElement sourcemappingforsystemfield;
   
   @FindBy(xpath = "//div[text()='Workflow Name']")
   public WebElement workflownameforsourcemappingsystemfield;
   
   @FindBy(xpath = "(//input[@role='combobox'])[2]")
   public WebElement integrationfieldtypeselection;
   
   @FindBy(xpath = "//span[text()='DNB DUNS Search']")
   public WebElement dnbdunssearch1;
   
   @FindBy(xpath = "//span[text()='Add option']")
   public WebElement dropdownmultiaddoption1;
   
   @FindBy(xpath = "//span[text()='Add Option']")
   public WebElement dropdownnmultiaddoptionpopup1;
   
   @FindBy(xpath = "//input[@name='label']")
   public WebElement dropdownmultiaddoptionlable1;
   
   @FindBy(xpath = "//input[@name='value']")
   public WebElement dropdownmultiaddoptionvalue1;
   
   @FindBy(xpath = "//span[text()='Add']")
   public WebElement addbuttonforaddoptionmultidropdown1;
   
   @FindBy(xpath = "//span[text()='Required']")
   public WebElement alertforselecttabletype1;
  
   @FindBy(xpath = "//span[text()='Editable Table']")
   public WebElement selecteditabletable;
   
   @FindBy(xpath = "//span[text()='Child Workflow Table']")
   public WebElement selectchildworkflowtable;
   
   @FindBy(xpath = "//span[text()='Add option']")
   public WebElement radioaddoption;
   
   @FindBy(xpath = "//span[text()='Add Option']")
   public WebElement radioaddoptionpopup;
   
   @FindBy(xpath = "//input[@name='label']")
   public WebElement radioaddoptionlable;
   
   @FindBy(xpath = "//input[@name='value']")
   public WebElement radioaddoptionvalue;
   
   @FindBy(xpath = "//span[text()='Add']")
   public WebElement radioaddoptionaddbtn;
   
   @FindBy(xpath = "//span[text()='Add group']")
   public WebElement groupcheckboxaddgroup;
   
   @FindBy(xpath = "//span[text()='Add Checkbox Group']")
   public WebElement addgroupcheckboxpopup;
   
   @FindBy(xpath = "//input[@name='parent']")
   public WebElement addgroupingroupcheckbox;
   
   @FindBy(xpath = "//span[text()='Add']")
   public WebElement addgroupcheckboxbtn;
   
   @FindBy(xpath = "//span[text()='Add option']")
   public WebElement groupcheckboxaddoption1;
   
   @FindBy(xpath = "//span[text()='Add Option']")
   public WebElement addoptioncheckboxforgroupcheckbox1;   
   
   @FindBy(xpath = "//input[@name='label']")
   public WebElement addgroupcheckboxlable1;
   
   @FindBy(xpath = "//input[@name='value']")
   public WebElement addgroupcheckboxvalue1;
   
   @FindBy(xpath = "//span[text()='Add']")
   public WebElement addbtnforgroupcheckboxaddoption1;
   
   @FindBy(xpath = "(//span[@aria-label='Search'])[1]")
   public WebElement searchcomponent1;
   
   @FindBy(xpath = "//span[text()='Search Component']")
   public WebElement searchcomponentpopup;
   
   @FindBy(xpath = "//input[@placeholder='Search components...']")
   public WebElement searchbarforsearchcomponent;
   
   @FindBy(xpath = "//span[@class='ant-input-group-addon']")
   public WebElement crossiconsearchbar;
   
   @FindBy(xpath = "//b[text()='Swimlane']")
   public WebElement searchbarswimselection;
   
   @FindBy(xpath = "//span[text()='Swimlane']")
   public WebElement swimlanefocus;
   
   @FindBy(xpath = "//b[text()='STEP']")
   public WebElement searchbarstepselection1;
   
   @FindBy(xpath = "//span[text()='STEP']")
   public WebElement stepfocus1;
   
   @FindBy(xpath = "//b[text()='array']")
   public WebElement searchbarfieldselection1;
   
   @FindBy(xpath = "//span[text()='array']")
   public WebElement fieldfocus1;
   
   //step level rules element
   
   @FindBy(xpath = "//span[text()='STEP']")
   public WebElement selectstepinswim1;
   
   @FindBy(xpath = "//span[@aria-label='Gear']")
   public WebElement selectconfigurestepproperties;
   
   @FindBy(xpath = "//div[text()='Rules']")
   public WebElement clickrules1;
   
   @FindBy(xpath = "(//span[text()='Configure'])[1]")
   public WebElement conditionalaccessrules;
   
   @FindBy(xpath = "//span[text()='Properties']")
   public WebElement scrollforrules1;
   
   @FindBy(xpath = "//span[text()='Add Rule']")
   public WebElement conditionaccessrulebtn;
   
   @FindBy(xpath = "//span[text()='Conditions']")
   public WebElement conditionalaccessrulescreen1;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement conditionaccessrulesavebtn;
   
   @FindBy(xpath = "//input[@id='compareFrom']")
   public WebElement comparefieldforconditionaccessrule;
   
   @FindBy(xpath = "//div[@title='array']")
   public WebElement selectfieldforconditionaccessrule;
   
   @FindBy(xpath = "(//span[@aria-label='Close'])[2]")
   public WebElement closeconditionaccessrule;
   
   @FindBy(xpath = "(//span[@variant='p2-bold'])[1]")
   public WebElement conditionaccessruleicon;
   
   @FindBy(xpath = "//span[text()='PDF Rules']")
   public WebElement pdfrule;
   
   @FindBy(xpath = "(//span[text()='Configure'])[2]")
   public WebElement clickpdfrule;
   
   @FindBy(xpath = "//span[text()='Add Rule']")
   public WebElement clickaddruleforpdfrule;
   
   @FindBy(xpath = "//span[text()='Rules that drive pdf configuration of the current node']")
   public WebElement pdfruleconfigurationscreen;
   
   @FindBy(xpath = "//div[text()='Other Configuration']")
   public WebElement clickotherconfiguration;
   
   @FindBy(xpath = "//span[text()='PDF Config']")
   public WebElement scrollpdfconfig;
   
 //  @FindBy(xpath = "(//div[@class='ace_cursor'])[2]/parent::div")
 //  public WebElement filljsonforpdfrule;
   
   @FindBy(xpath = "(//div[@class='ace_line'])[2]")
   public WebElement filljsonpdfrule;
   
   @FindBy(xpath = "(//span[@class='ace_paren ace_rparen'])[2]")
   public WebElement filljsonpdfrule1;
   
   @FindBy(xpath = "(//textarea[@class='ace_text-input'])[2]")
   public WebElement jsonsodefill;

   @FindBy(xpath = "(//div[@class='jsoneditor-modes'])[2]")
   public WebElement pdfconfigcodeclick1;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement savepdfjson;
   
   @FindBy(xpath = "//span[text()='Visibility Rules']")
   public WebElement visibilityrulescroll;
   
   @FindBy(xpath = "(//span[text()='Configure'])[3]")
   public WebElement visibilityrulebtn1;
   
   @FindBy(xpath = "//span[text()='Add Rule']")
   public WebElement visiibilityruleaddrulebtn1;
   
   @FindBy(xpath = "//input[@id='compareFrom']")
   public WebElement comparefieldforvisibilityrule;
   
   @FindBy(xpath = "(//span[text()='pdf'])[2]")
   public WebElement selectfieldforvisivillityrule;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement visibilityrulesavebtn;
   
   @FindBy(xpath = "//span[text()='Import JSON']")
   public WebElement importjson1;
   
   @FindBy(xpath = "(//span[@variant='p2-bold'])[1]")
   public WebElement visibilityruleicon;
   
   @FindBy(xpath = "(//span[text()='Configure'])[4]")
   public WebElement clickautosubmitautorevertrules;
   
   @FindBy(xpath = "//span[text()='Add Rule']")
   public WebElement autosubmitruleaddbtn1;
   
   @FindBy(xpath = "//input[@id='compareFrom']")
   public WebElement comparefieldforautosubmitrule1;
   
   @FindBy(xpath = "(//span[text()='pdf'])[2]")
   public WebElement selectfieldforautosubmitrule1;
   
   @FindBy(xpath = "(//span[@variant='p2-bold'])[1]")
   public WebElement autosubmitruleicon;
   
   @FindBy(xpath = "(//span[text()='Configure'])[5]")
   public WebElement clicknotificationrule;
   
   @FindBy(xpath = "//span[text()='Add Rule']")
   public WebElement notificationruleaddbtn;
   
   @FindBy(xpath = "//span[text()='Rule 1']")
   public WebElement scrollfornotificationrule;
   
   @FindBy(xpath = "//span[text()='Step Completed']")
   public WebElement selectstepcompletedfornotificationrule;
   
   @FindBy(xpath = "//input[@id='template']")
   public WebElement selectemailtemplatefornotificationrule;
   
   @FindBy(xpath = "(//div[text()='requestor_mail'])[2]")
   public WebElement selectmailtemplate;
   
   @FindBy(xpath = "//input[@id='to_emails']")
   public WebElement clickemailfieldinnotificationrule;
   
   @FindBy(xpath = "(//span[text()='email'])[2]")
   public WebElement selectemailinemailfield;
   
   @FindBy(xpath = "(//span[text()='Save'])[2]")
   public WebElement savenotificationrule1;
   
   @FindBy(xpath = "//input[@id='name']")
   public WebElement fillnamefornotificationrule1;
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
