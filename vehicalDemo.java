import java.awt.*;
import java.awt.event.*;
import java.util.*;

class vehical//class to store vehical details.
{
    int vId;
    String vBrand,vColour;
    vehical(){};
    vehical(int no,String name,String colour)
    {
        this.vId=no;
        this.vBrand=name;
        this.vColour=colour;
    }
    @Override
    public String toString()
    {
        return ("Vehical Number:"+vId+"\nVehical Name:"+vBrand+"\nVehical Colour:"+vColour);
    }

}

class vehicalDemo extends Frame
{
    //Creating objects for each component outside constructor.
    Label l1,l2,l3;
    TextField t1=new TextField(),t2=new TextField(),t3=new TextField();
    Button b1,b2,b3;
    TextArea ta1=new TextArea();

    vehical[] vehical=new vehical[20];//array of vehicals
    int count1=0,i;
    String vId;
    HashMap<Integer,vehical> map=new HashMap<>();
    vehicalDemo()
    {
        //set text in each label.
        l1=new Label("Vehical Id");
        l2=new Label("Vehical Brand");
        l3=new Label("Vehical Colour");

        //set button name.
        b1=new Button("Add");
        b2=new Button("Display");
        b3=new Button("Search");


        //placing labels in frame.
        l1.setBounds(50,80,100,20);
        l2.setBounds(50,120,100,20);
        l3.setBounds(50,170,100,20);

        //placing text fields in frame.
        t1.setBounds(180,80,220,20);
        t2.setBounds(180,120,220,20);
        t3.setBounds(180,170,220,20);

        //placing buttons in frame.
        b1.setBounds(70,230,60,25);
        b2.setBounds(190,230,80,25);
        b3.setBounds(330,230,80,25);

        ta1.setBounds(50,270,385,300);//placing text area for output.
        ta1.setEditable(false);//can't edit text in text area.

        //handling **add button**
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //checking weather all fields are entered
                if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals(""))
                {
                    ta1.setText("Please,fill all details of vehical");
                    return;
                }
                vId=t1.getText();
                if(vId.length()<5)//checks id is > 4 digits
                {
                    ta1.setText("Vehical number must be greater than 4 digits");
                    return;
                } 
                
                boolean idExist=false;
                for(int j=0;j<count1;j++)//duplicate vehicle id not allowed
                if(Integer.valueOf(vehical[j].vId).equals(Integer.parseInt(vId)))
                {
                    idExist=true;
                    break;
                }
                if(idExist)
                {
                    ta1.setText("Vehical is already registered with the id");
                    return;
                }
                vehical[count1]=new vehical(Integer.parseInt(vId),t2.getText(),t3.getText());
                map.put(vehical[count1].vId,vehical[count1]);//pushing to hashmap
                count1++;
                t1.setText("");
                t2.setText("");
                t3.setText("");
                ta1.setText("Added Sucessfully");
            }
        });


        //handling  **Display Button**.
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ta1.setText("");
                if(count1==0)
                {
                    ta1.setText("No vehicals added to display");
                    return;
                }

                TreeMap<Integer,vehical> treemap=new TreeMap<>(map);//to get ascending order.

                for(Map.Entry<Integer,vehical> entry:treemap.entrySet())//prints data in tree.
                    ta1.append(entry.getValue().toString()+"\n\n");

                
            }

        });

        //handling **Search Button**.
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(count1==0)//checks weather map is empty.
                {
                    ta1.setText("No details added to search");
                    t2.setText("");
                    return;
                }
                if(t2.getText().equals(""))//checks weather fiels is empty.
                {
                    ta1.setText("Enter brand Name to search");
                    t2.setText("");
                    return;
                }
                boolean found=false;
                //search for the brand in our data
                for(i=0;i<count1;i++)
                    if(vehical[i].vBrand.equals(t2.getText()))
                    {
                        ta1.setText(vehical[i].toString());
                        found=true;
                    }
                if(!found)//
                    ta1.setText("No data with such brand name");
                t2.setText("");

            }
        });

        //handling window event
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

        //adding components to frame
        add(l1);add(l2);add(l3);
        add(t1);add(t2);add(t3);
        add(b1);add(b2);add(b3);
        add(ta1);

        //frame setting
        setSize(500,600);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        vehicalDemo v=new vehicalDemo();
    }
}