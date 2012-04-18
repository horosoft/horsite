package com.example.horsite;

import com.vaadin.Application;
import com.vaadin.addon.chameleon.ChameleonTheme;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UriFragmentUtility.FragmentChangedEvent;
import com.vaadin.ui.UriFragmentUtility.FragmentChangedListener;


public class HorsiteApplication extends Application {
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	String AtelImage = "img/reldatenet.png";


	abstract class content{
		String langugeBarLabel;
		String langugeBarEnglishButton;
		String langugeBarRussionButton;
		String haderTitle;
		String hederSlogan;
		String aboutMenuButton;
		String projectsMenuButton;
		String cvMenuButton;
		String contatsMenuButton;
		String underConstractionLabel;
		String aboutLabel;
		String projectLabelAtel;
		String projectLabelTayra;
		String projectLabelRdate;
		String cvLabel;
		String contactsLabel;
	}
	
	class englishContent extends content{
		
	}
	
	class russianContent extends content{
		
	}
	content con;
	russianContent rCon = new russianContent();
	englishContent eCon  = new englishContent();
	Application thisApp = this;
	Window mainWindow;
	
	private void fillContents(){
		
		rCon.langugeBarLabel = "Change language to:";
		eCon.langugeBarLabel = "������� ���� ��:";
		rCon.langugeBarRussionButton = "English";
		eCon.langugeBarRussionButton = "�������";
		//rCon.langugeBarEnglishButton = "English";
		//eCon.langugeBarEnglishButton = "English";
		
		rCon.haderTitle = "��������";
		eCon.haderTitle = "HoroSoft";
		rCon.hederSlogan = "���������� � ��������� IT �������";
		eCon.hederSlogan = "Software and Web development";
		
		rCon.aboutMenuButton = "� ���";
		eCon.aboutMenuButton = "About us";
		rCon.projectsMenuButton = "�������";
		eCon.projectsMenuButton = "Projects";
		rCon.cvMenuButton = "������������";
		eCon.cvMenuButton = "Developers";
		rCon.contatsMenuButton = "��������";
		eCon.contatsMenuButton = "Contacts";
		
		rCon.underConstractionLabel = "�������� ��������� � ����������";
		eCon.underConstractionLabel = "Page under conctruction";
		rCon.aboutLabel = "<p>���� ������������� �������� ���������� ����������� � ��������� ������������:<br><ul type=\"disc\"> <li>���������� ����������<ul type=\"circle\"><li>������ ����������</li><li>��� ����������</li><li>��������� ����������</li><li>������������ ����������</li><li>���������� � ������� �����</li><li>� ��</li></ul></li></ul><ul type=\"disc\"><li>��� ����������<ul type=\"circle\"><li>�����-�������</li><li>�������� �������</li><li>�������� ��������</li><li>������������� �����</li><li>� ��</li></ul></li></ul><ul type=\"disc\"><li>������������ � ����������� ������<ul type=\"circle\"><li>SEO</li><li>SMO</li><li>������.������</li><li>Google AdWords</li><li>� ��</li></ul></li></ul><ul type=\"disc\"><li>����������� ������������ �����������<ul type=\"circle\"><li>��������� ���������������</li><li>�������� �����������������</li><li>�������������� � ���������� ����</li><li>������ ������������</li><li>� ��</li></ul></li></ul><br>������� ����������� � ������ ����� �������� ����� ����� � ������� �<a href=\"http://horosoft.org#projects\">���� �������</a>�</p><p>�������� ����� ��������� ������������� ���� ������� �����������, ������ �� ������� ��������� � �������� � ������ �����. ������� � ������ ����� ����������� ����� ����� � <a href=\"http://horosoft.org/#developers\">���������������</a> �������.</p><p>���������� ��������������� ������� � �������� ��������� ��� �������� �������� ������������ ��������� � ��������� ����� ����������. �� �������� ���������� ����� ��������� � ���� �� e-mail ��� ������ ������� �������� ��� ���� ����� ������� ����������� � ������� �<a href=\"http://horosoft.org/#contacts\">��������<a/>�.</p>";
		eCon.aboutLabel = "<p>Our company can offer you high quality development service, such as:<br><ul type=\"disc\"><li>Software development<ul type=\"circle\"><li>Business software</li><li>Web applications</li><li>Mobile applications</li><li>Parallel applications</li><li>Scientific applications</li><li>etc</li></ul></li></ul><ul type=\"disc\"><li>Web<ul type=\"circle\"><li>Promo websites</li><li>Internet portals</li><li>Internet shops</li><li>Corporate websites</li><li>etc</li></ul></li></ul><ul type=\"disc\"> <li>Website promotion and maintenance<ul type=\"circle\"><li>SEO</li><li>SMO</li><li>Yandex.Direct</li><li>Google AdWords</li><li>etc</li></ul></li></ul><ul type=\"disc\"> <li>Remote support outsource<ul type=\"circle\"><li>Windows Servers</li><li>*nix servers</li><li>VOIP servers</li><li>Mail Servers</li><li>etc</li></ul></li></ul><br>You can find projects made by our company under the �Projects� tab</p><p>Our company has growing number of experienced employees. Each of them makes progress in his skills every day and every project he works on. You can find list of s kills and  third-party procjects of our employees under the �Developers� tab.</p><p>We use individual approach to every project. And it allows us to increase quality and decrease time spent on project development. Feel free to contact us with any question. You can find email and other contacts on the �Contacts� tab.</p>";
		//rCon.projectLabelAtel = "<p>&nbsp;&nbsp;&nbsp;&nbsp;������������� ���� ��� �������� ���������� ���������� ������������<br>&nbsp;&nbsp;&nbsp;&nbsp;��� ��������</p> &nbsp;&nbsp;&nbsp;&nbsp;�������� � ����:<ul><li>������� ���������</li><li>�������</li></ul>";
		//eCon.projectLabelAtel = "<p>&nbsp;&nbsp;&nbsp;&nbsp;Corporate website for novosibirsk cable company<br>&nbsp;&nbsp;&nbsp;&nbsp;�Advatel� LLC</p> &nbsp;&nbsp;&nbsp;&nbsp;Includes:<ul><li>Catalog</li><li>News</li></ul>";
		rCon.projectLabelTayra = "<p>&nbsp;&nbsp;&nbsp;&nbsp;���������� �� ������� ������������ ��� ��������� ���<br>&nbsp;&nbsp;&nbsp;&nbsp; ��� ���� ������</p><p>&nbsp;&nbsp;&nbsp;&nbsp;�������� � ����:<ul><li>������� ���������<ul type=\"circle\"><li>������� ������������� �����������</li><li>����������� � doc ������</li></ul></li><li>����� �������<ul type=\"circle\"><li>�������� �������</li><li>����������� �����</li></ul></li></ul></p>";
		eCon.projectLabelTayra = "<p>&nbsp;&nbsp;&nbsp;&nbsp;Application for fan selection depending on building written for<br>&nbsp;&nbsp;&nbsp;&nbsp;  NEMP �Tayra� LLC</p><p>&nbsp;&nbsp;&nbsp;&nbsp;Includes:<ul><li>Catalog<ul type=\"circle\"><li>Fan characteristic graphs</li><li>Convertation to MS .doc foramt </li></ul></li><li>Selection<ul type=\"circle\"><li>Selection algorythm</li><li>Graphic mode</li></ul></li></ul></p>";
		rCon.projectLabelAtel = "<p>&nbsp;&nbsp;&nbsp;&nbsp;��� ������ ����������� � ������ ������ �� DVD ��� � ����<br>&nbsp;&nbsp;&nbsp;&nbsp;Release Date Of.Net</p> &nbsp;&nbsp;&nbsp;&nbsp;�������� � ����:<ul><li>���� �������</li><li>�����������</li><li>����������� �� email</li></ul>";
		eCon.projectLabelAtel = "<p>&nbsp;&nbsp;&nbsp;&nbsp;Web service for notiifying about upcoming movie releases<br>&nbsp;&nbsp;&nbsp;&nbsp;Release Date Of.Net</p> &nbsp;&nbsp;&nbsp;&nbsp;includes:<ul><li>Movie database</li><li>Registration</li><li>Email notification</li></ul>";
		ThemeResource nasonovimage = new ThemeResource("VAADIN/themes/chameleon-violet/img/nasonov.png");
		ThemeResource mikerinimage = new ThemeResource("VAADIN/themes/chameleon-violet/img/mikerin.png");
		ThemeResource nikolaevimage = new ThemeResource("VAADIN/themes/chameleon-violet/img/nikolaev.png");
		ThemeResource khrapovimage = new ThemeResource("VAADIN/themes/chameleon-violet/img/khrapov.png");
		ThemeResource sazonovimage = new ThemeResource("VAADIN/themes/chameleon-violet/img/sazonov.png");
		rCon.cvLabel = "<p><h3>����� �������</h3><br>"
			+ "<table height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"120\"><img src = \"" + sazonovimage +"\"/></td><td>���������� ��������� ����������<br> �������������� ����������� � ���������� ���������� ����������.</td></tr></table><br>"
			+ "<b>��������� ������������ � ������� �������:</b><br>������� ������������� ������� ����� ��� ��� ��������� (�. �����). ��������� Unix-���������� ��� ����������������� ������������� ������� ����� � ���������, ���-����������� � ����������������� ����-������.<br>���������� � ���������� ������������ ��������� ��� ������-����������� ������������� � ����-����������������</p>"
			+ "<b>������:</b><br><ul><li>����� ���������������� - C++, C#, Ruby</li><li>���������� � ���������� - C++ - Embedded Systems, Signals and Data processing, C# - WPF, Silverlight, Ruby - Ruby on Rails, Asterisk-based VoIP solutions (Adhearsion).</li></ul>"
			+ "<br><p><h3>������� �������</h3><br>"
			+ "<table height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"120\"><img src = \"" + mikerinimage +"\"/></td><td>�������������� � ���������� ���������� ��� Apple iOS, Mac OS X, Google Android, Microsoft Windows, Linux.</td></tr></table><br>"
			+ "<b>��������� ������������ � ������� �������:</b><br>Exp-lab + Massspectrometry tools - ������� �� ����� � ��������� ���������� � ��� L-card E20-10a � r-technology USB3000 ��� ���<br>AVE Intervision Amvonet (http://www.amvonet.com) - ������� �������������� ��������<br>���������� ��� iPhone App Store � VITO Technology (DK Family doctor, SolarWalk, GyroCompass3D)</p>"
			+ "<b>������:</b><br><ul><li>����� ���������������� - C++, C, Objective C, C#, Java</li><li>���������� � ���������� - Unity 3D, OpenGL (ES), Direct3D, boost, Loki, XUL runner,  Cocoa (Touch), Cocoa Touch, COM, Swing, SWT.</li></ul>"
			+ "<br><p><h3>�������� �������</h3><br>"
			+ "<table height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"120\"><img src = \"" + nasonovimage +"\"/></td><td>���������� ����������<br>��� ����������</td></tr></table><br>"
			+ "<b>��������� ������������ � ������� �������:</b><br>���������� � ������� �� �������� ���� ������ ������� ��������� ������������ � ���- � ��������������� ������� � ���� �� ���: ���������� ����������� ������ � �� ����������� � LaTeX. ���������� ����� ������������ ���� �� ������ � ����������� � Web'�, � ����� ���������� ���������������� layout ��������� ��� ����� �����. ���������� �������������� ������� ������������.</p>"
			+ "<b>������:</b><br><ul><li>����� ���������������� - C#, Java, C/C++, PHP, UML</li><li>���������� � ���������� - WPF, Vaadin, GWT, WinForms, HLSL, WinAPI, DirectX</li></ul>"
//			+ "<b>������� � ������/������:</b><br><br><a href=\"http://stackoverflow.com/users/644205/sonorx\" target=\"_blank\"><img src=\"http://stackoverflow.com/users/flair/644205.png\" width=\"208\" height=\"58\" alt=\"profile for Sonorx at Stack Overflow, Q&A for professional and enthusiast programmers\" title=\"profile for Sonorx at Stack Overflow, Q&A for professional and enthusiast programmers\"></a></p><br>"
			+ "<br><p><h3>����� ������</h3><br>"
			+ "<table height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"120\"><img src = \"" + khrapovimage +"\"/></td><td>���������� ����������<br>��� ����������</td></tr></table>"
			+ "<b>������:</b><br><ul><li>����� ���������������� - �#, Java, C/C++, SQL, JavaScript</li><li>���������� � ���������� - WinAPI, WPF, DirectX, OpenGL, STL, Google Maps API</li></ul>"
			+ "<br><p><h3>����� ��������</h3><br>"
			+ "<table height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"120\"><img src = \"" + nikolaevimage +"\"/></td><td>��������� �����������������.<br>���������</td></tr></table><br>"
			+ "<b>��������� ������������ � ������� �������:</b><br>�������������� ����������� ������ ���������� ���������� ��� ������������� ������ ����������, ���������� �� SIP � Asterisk � \"Orion Communications\".</p>"
			+ "<b>������:</b><br><ul><li>����� ���������������� - Java, HTML, CSS, Python</li><li>���������� � ���������� - Asterisk, MS Windows Server, *nix, SQL.</li></ul>";
			
	
		eCon.cvLabel = "Page under conctruction";
		rCon.contactsLabel = "<p><b>�������� \"��������\"</b><br>������, �. �����������</p><p><b>�� ���� �������� ����� ����������:</b><br>e-mail: <a href=\"mailto:info@horosoft.org\">info@horosoft.org</a></p><p><b>�� �������� ���������� ����������:</b><br>e-mail: <a href=\"nasonov.vladimir@horosoft.org\">nasonov.vladimir@horosoft.org</a><br>icq: 268655093<br>�������: +79139234617<br>������� �������� ������������</p><p><b>�� �������� ��� ����������, ������������ ������ � ����������������� �����������:</b><br>e-mail: <a href=\"mailto:nikolaev.anton@horosoft.org\">nikolaev.anton@horosoft.org</a><br>icq: 330153628<br>�������: +79137974240<br>�������� ����� ��������</p>";
		eCon.contactsLabel = "<p><b>\"Horosoft\" Company</b><br>Russia, Novosibirsk</p><p><b>If you have any questions, comments, or suggestions please contact us:</b><br>e-mail: <a href=\"info@horosoft.org\">info@horosoft.org</a></p><p><b>Software development:</b><br>e-mail: <a href=\"nasonov.vladimir@horosoft.org\">nasonov.vladimir@horosoft.org</a><br>icq: 268655093<br>Phone: +79139234617<br>Vladimir Nasonov</p><p><b>Web development, SEO and Remote administration outsource:</b><br>e-mail: <a href=\"mailto:nikolaev.anton@horosoft.org\">nikolaev.anton@horosoft.org</a><br>icq: 330153628<br>Phone: +79137974240<br>Anton Nikolaev</p>";
		
		con = rCon;
	}

	@Override
	public void init() {
		setTheme("chameleon-violet");
		fillContents();
		mainWindow = new Window();
		VerticalLayout mainLayout = new MainLayout();
		mainWindow.addComponent(mainLayout);
		setMainWindow(mainWindow);
	}
	

	public class MainLayout extends VerticalLayout{

	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	String AtelSite = "http://releasedateof.net";

	public MainLayout() {
	initComponents();
	}

	@Override
	public void attach() {
	super.attach();
	updateLabels();
	}

	@Override
	public void detach() {
	super.detach();
	}


	private Label langugeBarLbl;
	private Button langugeBarRussianBtn;
	//private Button langugeBarEnglishBtn;
	private Label haderTitleLbl;
	private Label haderSloganLbl;
	private Button aboutMenuBtn;
	private Button projectMenuBtn;
	private Button cvMenuBtn;
	private Button contactsMenuBtn;
	private Label underConstractionLbl;
	private Label aboutLbl;
	private Label projectLblAtel;
	//private Label projectLblRdate;
	private Label projectLblTayra;
	private Label cvLbl;
	private Label contactsLbl;
	
	HorizontalLayout fillAtelLayout(){
		HorizontalLayout prjAtelLayuot = new HorizontalLayout();
		prjAtelLayuot.setMargin(true);
		Button buttonAtelImg = new Button();
		ThemeResource atelImageRes = new ThemeResource(AtelImage);
		buttonAtelImg.setIcon(atelImageRes);
		buttonAtelImg.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);
		buttonAtelImg.addListener(new Button.ClickListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
			mainWindow.open(new ExternalResource(AtelSite));
			}
			});
		
		prjAtelLayuot.addComponent(buttonAtelImg);
		prjAtelLayuot.setComponentAlignment(buttonAtelImg, Alignment.MIDDLE_LEFT);
		return prjAtelLayuot;
	}
	
	/*HorizontalLayout fillRdateLayout(){
		HorizontalLayout prjRdateLayuot = new HorizontalLayout();
		prjRdateLayuot.setMargin(true);
		Button buttonRdateImg = new Button();
		ThemeResource dekoImageRes = new ThemeResource("img/reldatenet.png");
		buttonRdateImg.setIcon(dekoImageRes);
		buttonRdateImg.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);
		buttonRdateImg.addListener(new Button.ClickListener() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
			mainWindow.open(new ExternalResource("http://releasedateof.net"), "_blank");
			}
			});
		
		prjRdateLayuot.addComponent(buttonRdateImg);
		prjRdateLayuot.setComponentAlignment(buttonRdateImg, Alignment.MIDDLE_LEFT);
		prjRdateLayuot.addComponent(projectLblRdate);
		prjRdateLayuot.setComponentAlignment(projectLblRdate, Alignment.TOP_LEFT);
		return prjRdateLayuot;
	}
	*/
	HorizontalLayout fillTayraLayout(){
		HorizontalLayout prjTayraLayuot = new HorizontalLayout();
		prjTayraLayuot.setMargin(true);
		Button buttonTayraImg = new Button();
		ThemeResource tayraImageRes = new ThemeResource("img/tayra-screen.png");
		buttonTayraImg.setIcon(tayraImageRes);
		buttonTayraImg.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);
		prjTayraLayuot.addComponent(buttonTayraImg);
		prjTayraLayuot.setComponentAlignment(buttonTayraImg, Alignment.MIDDLE_LEFT);
		return prjTayraLayuot;
	}

	@SuppressWarnings("serial")
	private void initComponents() {
	setMargin(true);
	setSizeFull();
    final UriFragmentUtility pages = new UriFragmentUtility();
    mainWindow.addComponent(pages);
	aboutLbl = new Label("", Label.CONTENT_XHTML);
	
	projectLblAtel = new Label("", Label.CONTENT_XHTML);
	projectLblAtel.setWidth("540");
	projectLblTayra = new Label("", Label.CONTENT_XHTML);
	projectLblTayra.setWidth("580");
	
	final VerticalLayout prjLayout = new VerticalLayout();
	
	HorizontalLayout prjAtelLayuot = fillAtelLayout();
	HorizontalLayout prjTayraLayuot = fillTayraLayout();
	
	final HorizontalLayout prjWebLayout = new HorizontalLayout();
	final HorizontalLayout prjAppLayout = new HorizontalLayout();
	final Button webLeft = new Button();
	webLeft.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);	
	ThemeResource webleftImageRes = new ThemeResource("img/webleft.png");
	webLeft.setIcon(webleftImageRes);
	webLeft.setEnabled(false);
	final Button webRight = new Button();
	webRight.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);
	ThemeResource webrightImageRes = new ThemeResource("img/webright.png");
	webRight.setIcon(webrightImageRes);
	final Button appLeft = new Button();
	appLeft.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);	
	ThemeResource appleftImageRes = new ThemeResource("img/webleft.png");
	appLeft.setIcon(appleftImageRes);
	webLeft.setEnabled(false);
	final Button appRight = new Button();
	appRight.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);
	ThemeResource apprightImageRes = new ThemeResource("img/webright.png");
	appRight.setIcon(apprightImageRes);
	appLeft.setEnabled(false);
	appRight.setEnabled(false);
	webLeft.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
			rCon.projectLabelAtel="<p>&nbsp;&nbsp;&nbsp;&nbsp;��� ������ ����������� � ������ ������ �� DVD ��� � ����<br>&nbsp;&nbsp;&nbsp;&nbsp;Release Date Of.Net</p> &nbsp;&nbsp;&nbsp;&nbsp;�������� � ����:<ul><li>���� �������</li><li>�����������</li><li>����������� �� email</li></ul>";
			eCon.projectLabelAtel="<p>&nbsp;&nbsp;&nbsp;&nbsp;Web service for notiifying about upcoming movie releases<br>&nbsp;&nbsp;&nbsp;&nbsp;Release Date Of.Net</p> &nbsp;&nbsp;&nbsp;&nbsp;includes:<ul><li>Movie database</li><li>Registration</li><li>Email notification</li></ul>";
			AtelSite="http://releasedateof.net";
			AtelImage="img/reldatenet.png";
			webLeft.setEnabled(false);
			webRight.setEnabled(true);
			prjWebLayout.removeAllComponents();
			HorizontalLayout prjAtelLayuot = fillAtelLayout();
			prjWebLayout.addComponent(webLeft);
			prjWebLayout.setComponentAlignment(webLeft, Alignment.MIDDLE_LEFT);
			prjWebLayout.addComponent(prjAtelLayuot);
			prjWebLayout.setComponentAlignment(prjAtelLayuot, Alignment.MIDDLE_LEFT);
			prjWebLayout.addComponent(webRight);
			prjWebLayout.setComponentAlignment(webRight, Alignment.MIDDLE_LEFT);
			prjWebLayout.addComponent(projectLblAtel);
			prjWebLayout.setComponentAlignment(projectLblAtel, Alignment.TOP_LEFT);
			updateLabels();
		}
		});
	webRight.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
			rCon.projectLabelAtel="<p>&nbsp;&nbsp;&nbsp;&nbsp;������������� ���� ��� �������� ���������� ���������� ������������<br>&nbsp;&nbsp;&nbsp;&nbsp;��� ��������</p> &nbsp;&nbsp;&nbsp;&nbsp;�������� � ����:<ul><li>������� ���������</li><li>�������</li></ul>";
			eCon.projectLabelAtel="<p>&nbsp;&nbsp;&nbsp;&nbsp;Corporate website for novosibirsk cable company<br>&nbsp;&nbsp;&nbsp;&nbsp;�Advatel� LLC</p> &nbsp;&nbsp;&nbsp;&nbsp;Includes:<ul><li>Catalog</li><li>News</li></ul>";
			AtelSite="http://a2tel.ru/?q=prod_krone";
			AtelImage="img/a2tel.png";
			webLeft.setEnabled(true);
			webRight.setEnabled(false);
			prjWebLayout.removeAllComponents();
			HorizontalLayout prjAtelLayuot = fillAtelLayout();
			prjWebLayout.addComponent(webLeft);
			prjWebLayout.setComponentAlignment(webLeft, Alignment.MIDDLE_LEFT);
			prjWebLayout.addComponent(prjAtelLayuot);
			prjWebLayout.setComponentAlignment(prjAtelLayuot, Alignment.MIDDLE_LEFT);
			prjWebLayout.addComponent(webRight);
			prjWebLayout.setComponentAlignment(webRight, Alignment.MIDDLE_LEFT);
			prjWebLayout.addComponent(projectLblAtel);
			prjWebLayout.setComponentAlignment(projectLblAtel, Alignment.TOP_LEFT);
			updateLabels();
		}
		});
	
	prjWebLayout.addComponent(webLeft);
	prjWebLayout.setComponentAlignment(webLeft, Alignment.MIDDLE_LEFT);
	prjWebLayout.addComponent(prjAtelLayuot);
	prjWebLayout.setComponentAlignment(prjAtelLayuot, Alignment.MIDDLE_LEFT);
	prjWebLayout.addComponent(webRight);
	prjWebLayout.setComponentAlignment(webRight, Alignment.MIDDLE_LEFT);
	prjWebLayout.addComponent(projectLblAtel);
	prjWebLayout.setComponentAlignment(projectLblAtel, Alignment.TOP_LEFT);
	prjLayout.addComponent(prjWebLayout);
	prjAppLayout.addComponent(appLeft);
	prjAppLayout.setComponentAlignment(appLeft, Alignment.MIDDLE_LEFT);
	prjAppLayout.addComponent(prjTayraLayuot);
	prjAppLayout.setComponentAlignment(prjTayraLayuot, Alignment.MIDDLE_LEFT);
	prjAppLayout.addComponent(appRight);
	prjAppLayout.setComponentAlignment(appRight, Alignment.MIDDLE_LEFT);
	prjAppLayout.addComponent(projectLblTayra);
	prjAppLayout.setComponentAlignment(projectLblTayra, Alignment.TOP_LEFT);
	prjLayout.addComponent(prjAppLayout);
	
	cvLbl = new Label("", Label.CONTENT_XHTML);
	contactsLbl = new Label("", Label.CONTENT_XHTML);
	underConstractionLbl = new Label();
	final Panel contentPanel = new Panel();
	contentPanel.setWidth("900");
	contentPanel.addComponent(aboutLbl);
	pages.setFragment("about");
	
	HorizontalLayout hader = new HorizontalLayout();
	hader.setMargin(true);
	hader.setSizeFull();
	hader.setWidth("900");
	ThemeResource imageRes = new ThemeResource("img/logo.png");
	Button buttonLogoImg = new Button();
	buttonLogoImg.setIcon(imageRes);
	buttonLogoImg.setStyleName(ChameleonTheme.BUTTON_BORDERLESS);
	buttonLogoImg.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
		mainWindow.open(new ExternalResource("http://horosoft.org"));
		contentPanel.removeAllComponents();
		contentPanel.addComponent(aboutLbl);
		}
		});
	//Embedded image = new Embedded("", imageRes);
	//image.setType(Embedded.TYPE_IMAGE);
	hader.addComponent(buttonLogoImg);
	hader.setComponentAlignment(buttonLogoImg, Alignment.MIDDLE_LEFT);
	VerticalLayout TitleAndSlogan = new VerticalLayout();
	TitleAndSlogan.setSizeUndefined();
	TitleAndSlogan.setSpacing(true);
	haderTitleLbl = new Label();
	haderSloganLbl = new Label();
	haderTitleLbl.setStyleName(ChameleonTheme.LABEL_H1);
	haderSloganLbl.setStyleName(ChameleonTheme.LABEL_H2);
	haderTitleLbl.setSizeUndefined();
	TitleAndSlogan.addComponent(haderTitleLbl);
	TitleAndSlogan.setComponentAlignment(haderTitleLbl, Alignment.TOP_CENTER);
	haderSloganLbl.setSizeUndefined();
	TitleAndSlogan.addComponent(haderSloganLbl);
	TitleAndSlogan.setComponentAlignment(haderSloganLbl, Alignment.TOP_CENTER);
	HorizontalLayout menuBar = new HorizontalLayout();
	menuBar.setSizeUndefined();
	menuBar.setStyleName(ChameleonTheme.COMPOUND_HORIZONTAL_LAYOUT_SEGMENT);
	aboutMenuBtn = new Button();
	aboutMenuBtn.setSizeUndefined();
	aboutMenuBtn.setStyleName(ChameleonTheme.BUTTON_DEFAULT);
	aboutMenuBtn.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
		contentPanel.removeAllComponents();
		contentPanel.addComponent(aboutLbl);
		pages.setFragment("about");
		}
		});
	menuBar.addComponent(aboutMenuBtn);
	projectMenuBtn = new Button();
	projectMenuBtn.setSizeUndefined();
	projectMenuBtn.setStyleName(ChameleonTheme.BUTTON_DEFAULT);
	projectMenuBtn.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
		contentPanel.removeAllComponents();
		contentPanel.addComponent(prjLayout);
		pages.setFragment("projects");
		}
		});
	menuBar.addComponent(projectMenuBtn);
	cvMenuBtn = new Button();
	cvMenuBtn.setSizeUndefined();
	cvMenuBtn.setStyleName(ChameleonTheme.BUTTON_DEFAULT);
	cvMenuBtn.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
		contentPanel.removeAllComponents();
		contentPanel.addComponent(cvLbl);
		pages.setFragment("developers");
		}
		});
	menuBar.addComponent(cvMenuBtn);
	contactsMenuBtn = new Button();
	contactsMenuBtn.setSizeUndefined();
	contactsMenuBtn.setStyleName(ChameleonTheme.BUTTON_DEFAULT);
	contactsMenuBtn.addListener(new Button.ClickListener() {
		@Override
		public void buttonClick(ClickEvent event) {
		contentPanel.removeAllComponents();
		contentPanel.addComponent(contactsLbl);
		pages.setFragment("contacts");
		}
		});
	menuBar.addComponent(contactsMenuBtn);
	TitleAndSlogan.addComponent(menuBar);
	TitleAndSlogan.setComponentAlignment(menuBar, Alignment.BOTTOM_CENTER);
	hader.addComponent(TitleAndSlogan);
	hader.setComponentAlignment(TitleAndSlogan, Alignment.MIDDLE_CENTER);
	
	pages.addListener(new FragmentChangedListener() {
	    public void fragmentChanged(FragmentChangedEvent source) {
	        String fragment =
	                  source.getUriFragmentUtility().getFragment();
	        if (fragment.equals("about")||fragment.equals("projects")||fragment.equals("developers")||fragment.equals("contacts"))
	        {
	            contentPanel.removeAllComponents();
	            if (fragment.equals("contacts")) contentPanel.addComponent(contactsLbl);
	            if (fragment.equals("developers")) contentPanel.addComponent(cvLbl);
	            if (fragment.equals("projects")) contentPanel.addComponent(prjLayout);
	            if (fragment.equals("about")) contentPanel.addComponent(aboutLbl);
	        }
	    }
	});
	
	VerticalLayout languageBar = new VerticalLayout();
	languageBar.setSizeUndefined();
	languageBar.setMargin(true, true, true, false);
	languageBar.setSpacing(true);
	
	langugeBarLbl = new Label();
	langugeBarLbl.setSizeUndefined();
	languageBar.addComponent(langugeBarLbl);
	languageBar.setComponentAlignment(langugeBarLbl, Alignment.MIDDLE_CENTER);

	/*langugeBarEnglishBtn = new Button();
	langugeBarEnglishBtn.addListener(new Button.ClickListener() {
	@Override
	public void buttonClick(ClickEvent event) {
	con = eCon;
	updateLabels();
	}
	});
	//langugeBarEnglishBtn.addStyleName(ChameleonTheme.BUTTON_DEFAULT);
		langugeBarEnglishBtn.setIcon(enImageRes);
	languageBar.addComponent(langugeBarEnglishBtn);
	languageBar.setComponentAlignment(langugeBarEnglishBtn, Alignment.MIDDLE_CENTER);*/
	final ThemeResource enImageRes = new ThemeResource("img/en.png");
	final ThemeResource ruImageRes = new ThemeResource("img/ru.png");
	langugeBarRussianBtn = new Button();
	langugeBarRussianBtn.addListener(new Button.ClickListener() {
	@Override
	public void buttonClick(ClickEvent event) {
	if (con==eCon){
	con = rCon;
	updateLabels();
	langugeBarRussianBtn.setIcon(enImageRes);
	}
	else
	{
		con = eCon;
		updateLabels();
		langugeBarRussianBtn.setIcon(ruImageRes);
	};
	}
	});
	//langugeBarRussianBtn.addStyleName(ChameleonTheme.BUTTON_DEFAULT);
	
	langugeBarRussianBtn.setIcon(enImageRes);
	languageBar.addComponent(langugeBarRussianBtn);
	languageBar.setComponentAlignment(langugeBarRussianBtn, Alignment.BOTTOM_CENTER);

	hader.addComponent(languageBar);
	hader.setComponentAlignment(languageBar, Alignment.MIDDLE_RIGHT);
	
	
	addComponent(hader);
	setComponentAlignment(hader, Alignment.TOP_CENTER);
	
	
	
	
	
	addComponent(contentPanel);
	setComponentAlignment(contentPanel, Alignment.MIDDLE_CENTER);
	}

	private void updateLabels() {
		langugeBarLbl.setValue(con.langugeBarLabel);
		//langugeBarEnglishBtn.setCaption(con.langugeBarEnglishButton);
		langugeBarRussianBtn.setCaption(con.langugeBarRussionButton);
		
		haderTitleLbl.setValue(con.haderTitle);
		haderSloganLbl.setValue(con.hederSlogan);
		
		aboutMenuBtn.setCaption(con.aboutMenuButton);
		projectMenuBtn.setCaption(con.projectsMenuButton);
		cvMenuBtn.setCaption(con.cvMenuButton);
		contactsMenuBtn.setCaption(con.contatsMenuButton);
		
		underConstractionLbl.setValue(con.underConstractionLabel);
		aboutLbl.setValue(con.aboutLabel);
		projectLblAtel.setValue(con.projectLabelAtel);
		//projectLblRdate.setValue(con.projectLabelRdate);
		projectLblTayra.setValue(con.projectLabelTayra);
		cvLbl.setValue(con.cvLabel);
		contactsLbl.setValue(con.contactsLabel);
	}
		
	}

}

