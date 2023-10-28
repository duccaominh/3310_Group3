package uta.cse.cse3310.JSBSimEdit.ui.windows;

import generated.FdmConfig;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainWindow extends JFrame {
    private JTextArea resultTextArea;
    private File file;
    
    public MainWindow(String title) {
        super(title);
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1190, 720);

        file = new File("untitled.xml");

        JMenuBar menuBar = createMenuBar();
        setJMenuBar(menuBar);

        JToolBar toolBar = createToolBar();
        Container pane = this.getContentPane();
        pane.add(toolBar, BorderLayout.NORTH);

        JLabel display = new JLabel();
        display.setFont(new Font("SansSerif", Font.BOLD, 17));
        add(display, BorderLayout.CENTER);

        //FIXME: Remove when possible 
        // R E S U L T
        // resultTextArea = new JTextArea();
        // resultTextArea.setEditable(false);

        // JPanel btnPanel = new JPanel();
        // btnPanel.add(openFile);
        // btnPanel.add(quitB);

        // JScrollPane scrollPane = new JScrollPane(resultTextArea);
        // getContentPane().setLayout(new BorderLayout());
        // getContentPane().add(btnPanel, BorderLayout.LINE_START);
        // getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Make everything in the JFrame visible
        setVisible(true);
    }

    private void parseXMLFile() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("generated");
    
            Unmarshaller um = jaxbContext.createUnmarshaller();
            // Unmarshal (read) an XML document into a Java object
            FdmConfig cfg = (FdmConfig) um.unmarshal(file);
            // System.out.println(cfg.getName());
            
            // System.out.println(cfg);
            // System.out.println(cfg.getFileheader().getCopyright());
            // System.out.println(cfg.getFileheader().getVersion() );
            // System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
            // System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
            // System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass());


            Marshaller m = jaxbContext.createMarshaller();
            m.setProperty("jaxb.formatted.output", true);
            m.marshal(cfg, new File("output.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        // try {
        //     resultTextArea.setText("");
        //     SAXParserFactory factory = SAXParserFactory.newInstance();
        //     SAXParser saxParser = factory.newSAXParser();
        //     HelperHandler handler = new HelperHandler(resultTextArea);
        //     saxParser.parse(filename, handler);
        // } catch (Exception e) {
        //     e.printStackTrace();
        //     resultTextArea.setText("Something is wrong: " + e.getMessage());
        // }
    }

    protected void onOpenClick() {
        final JFileChooser fc = new JFileChooser(file); // Create a file chooser dialog
        FileFilter xmlFileFilter = new FileNameExtensionFilter("xml files", "xml");
        fc.addChoosableFileFilter(xmlFileFilter); // Add "xml file" filter
        fc.setFileFilter(xmlFileFilter); // Show xml files only by default

        int result = fc.showOpenDialog(this); // Run dialog, return button clicked
        if (result == JFileChooser.APPROVE_OPTION) { // Also CANCEL_OPTION and ERROR_OPTION
            file = fc.getSelectedFile(); // Obtain the selected File object
            parseXMLFile();
            new CommanderWindow("JSBSim Commander");
        }
    }

    protected void onQuitClick() {
        System.exit(0);
    }


    private JMenuBar createMenuBar() {
        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(event -> onOpenClick());

        JMenuItem quitMenuItem = new JMenuItem("Quit");
        quitMenuItem.addActionListener(event -> onQuitClick());

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(openMenuItem);
        fileMenu.add(quitMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        return menuBar;
    }

    private JToolBar createToolBar() {
        JButton openFileButton = new JButton(new ImageIcon("src/main/java/uta/cse/cse3310/JSBSimEdit/resources/airplane.png"));
        openFileButton.setActionCommand("Open File");
        openFileButton.setToolTipText("Open an existing fileMenu");
        openFileButton.addActionListener(event -> onOpenClick());

        JButton quitButton = new JButton(new ImageIcon("src/main/java/uta/cse/cse3310/JSBSimEdit/resources/reject.png"));
        quitButton.setActionCommand("Quit");
        quitButton.setToolTipText("Exit Window");
        quitButton.addActionListener(event -> onQuitClick());

        JToolBar toolBar = new JToolBar("JSBSim Edit Controls");
        toolBar.add(openFileButton);
        toolBar.add(quitButton);

        return toolBar;
    }
}
