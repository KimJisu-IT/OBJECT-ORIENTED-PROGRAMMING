import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;


public class CalculatorDemo extends JFrame implements ActionListener {
   private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
   private JButton bpm, bdot, bp, bm, bmulti, bd, bsqrt, bpercent, bx, bequal;
   private JButton bback, bc;
   private JTextField jtf;
   // 계산기에서 사용할 버튼과 텍스트 필드 객체 선언

   GridBagConstraints cc;
   Container ct;
   JPanel jp1;
   
   
   
  public CalculatorDemo() {
   GridBagLayout gridbag = new GridBagLayout();
   cc = new GridBagConstraints();
   cc.weightx = 1.0;
   cc.weighty = 1.0;
   cc.fill = GridBagConstraints.BOTH;
   b0 = new JButton("0");
   b1 = new JButton("1");
   b2 = new JButton("2");
   b3 = new JButton("3");
   b4 = new JButton("4");
   b5 = new JButton("5");
   b6 = new JButton("6");
   b7 = new JButton("7");
   b8 = new JButton("8");
   b9 = new JButton("9");
   bpm = new JButton("+/-");
   bdot = new JButton(".");
   bp = new JButton("+");
   bm = new JButton("-");
   bmulti = new JButton("*");
   bd = new JButton("/");
   bsqrt = new JButton("sqrt");
   bpercent = new JButton("%");
   bequal = new JButton("=");
   // 모든 버튼 객체 생성
   jp1 = new JPanel();
   jp1.setLayout((LayoutManager) gridbag);
   // 판넬 객체를 생성하고 레이아웃을 4행5열로 설정
   layout(b7,0,0,1,1);
   layout(b8,1,0,1,1);
   layout(b9,2,0,1,1);
   layout(bd,3,0,1,1);
   layout(bsqrt,4,0,1,1);
   layout(b4,0,1,1,1);
   layout(b5,1,1,1,1);
   layout(b6,2,1,1,1);
   layout(bmulti,3,1,1,1);
   layout(bpercent,4,1,1,1);
   layout(b1,0,2,1,1);
   layout(b2,1,2,1,1);
   layout(b3,2,2,1,1);
   layout(bm,3,2,1,1);
   layout(bp,4,2,1,2);  // "+" 부분
   layout(b0,0,3,1,1);
   layout(bpm,1,3,1,1);
   layout(bdot,2,3,1,1);
   layout(bequal,3,3,1,1);
   jp1.setBorder(new TitledBorder("계산기 입력 버튼"));
   // 판넬을 표시하는 타이틀 경계선을 설정
   
   
   bback = new JButton("Backspace");
   bc = new JButton("C");
   // 두개의 버튼 객체 생성
   
   
   JPanel jp2 = new JPanel();
   jp2.setLayout(new GridLayout(1,2,5,5));
   jp2.add(bback);
   jp2.add(bc);
   jp2.setBorder(new TitledBorder("지우기 버튼"));
   // 판넬을 생성하고 레이아웃 설정, 객체 추가, 경계선 설정
   
   
   JPanel jp3 = new JPanel();
   jtf = new JTextField();
   // 텍스트필드 객체 생성
   
   
   jp3.setLayout(new GridLayout(1,1,5,5));
   jp3.add(jtf);
   jtf.setHorizontalAlignment(JTextField.RIGHT);
   // 텍스트 필드의 정렬을 오른쪽으로 설정
   
   
   jtf.setEditable(false);
   // 텍스트 필드 직접 조작 금지 설정
   
   
   jp3.setBorder(new TitledBorder("계산 결과 창"));
   // 경계선 설정
   
   
   ct = getContentPane();
   ct.setLayout(new BorderLayout(5,5));
   ct.add(jp3, BorderLayout.NORTH);
   ct.add(jp2, BorderLayout.CENTER);
   ct.add(jp1, BorderLayout.SOUTH);
   // 프레임에 판넬 3개 추가
   
  }
  public void layout(Component obj, int x, int y,int width, int height)
  {
   cc.gridx=x; // 시작위치 x
   cc.gridy=y; // 시작위치 y
   cc.gridwidth=width; // 컨테이너 너비
   cc.gridheight=height;  // 컨테이너 높이
   jp1.add(obj,cc);
  }

  public static void main(String[] args){
   CalculatorDemo ccc = new CalculatorDemo();
   ccc.setTitle("Calculator");
   ccc.setSize(350,300);
   ccc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   ccc.setVisible(true);
   }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


}




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
public class CalculatorDemo extends JFrame implements ActionListener {
   private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
   private JButton bpm, bdot, bp, bm, bmulti, bd, bsqrt, bpercent, bx, bequal;
   private JButton bback, bc;
   private JTextField jtf;
   // 계산기에서 사용할 버튼과 텍스트 필드 객체 선언
   private String operand, operator;
   // 첫번째 오퍼란드 값을 저장할 operand와 오퍼레이터를 저장할 operator 선언
   GridBagConstraints cc;
   Container ct;
   JPanel jp1;
  public CalculatorDemo() {
   GridBagLayout gridbag = new GridBagLayout();
   cc = new GridBagConstraints();
   cc.weightx = 1.0;
   cc.weighty = 1.0;
   cc.fill = GridBagConstraints.BOTH;
   b0 = new JButton("0");
   b1 = new JButton("1");
   b2 = new JButton("2");
   b3 = new JButton("3");
   b4 = new JButton("4");
   b5 = new JButton("5");
   b6 = new JButton("6");
   b7 = new JButton("7");
   b8 = new JButton("8");
   b9 = new JButton("9");
   bpm = new JButton("+/-");
   bdot = new JButton(".");
   bp = new JButton("+");
   bm = new JButton("-");
   bmulti = new JButton("*");
   bd = new JButton("/");
   bsqrt = new JButton("sqrt");
   bpercent = new JButton("%");
   bequal = new JButton("=");
   // 모든 버튼 객체 생성
   jp1 = new JPanel();
   jp1.setLayout(gridbag);
   // 판넬 객체를 생성하고 레이아웃을 4행5열로 설정
   layout(b7,0,0,1,1);
   layout(b8,1,0,1,1);
   layout(b9,2,0,1,1);
   layout(bd,3,0,1,1);
   layout(bsqrt,4,0,1,1);
   layout(b4,0,1,1,1);
   layout(b5,1,1,1,1);
   layout(b6,2,1,1,1);
   layout(bmulti,3,1,1,1);
   layout(bpercent,4,1,1,1);
   layout(b1,0,2,1,1);
   layout(b2,1,2,1,1);
   layout(b3,2,2,1,1);
   layout(bm,3,2,1,1);
   layout(bp,4,2,1,2);  // "+" 부분
   layout(b0,0,3,1,1);
   layout(bpm,1,3,1,1);
   layout(bdot,2,3,1,1);
   layout(bequal,3,3,1,1);
   jp1.setBorder(new TitledBorder("계산기 입력 버튼"));
   // 판넬을 표시하는 타이틀 경계선을 설정
   bback = new JButton("Backspace");
   bc = new JButton("C");
   // 두개의 버튼 객체 생성
   JPanel jp2 = new JPanel();
   jp2.setLayout(new GridLayout(1,2,5,5));
   jp2.add(bback);
   jp2.add(bc);
   jp2.setBorder(new TitledBorder("지우기 버튼"));
   // 판넬을 생성하고 레이아웃 설정, 객체 추가, 경계선 설정
   JPanel jp3 = new JPanel();
   jtf = new JTextField();
   // 텍스트필드 객체 생성
   jp3.setLayout(new GridLayout(1,1,5,5));
   jp3.add(jtf);
   jtf.setHorizontalAlignment(JTextField.RIGHT);
   // 텍스트 필드의 정렬을 오른쪽으로 설정
   jtf.setEditable(false);
   // 텍스트 필드 직접 조작 금지 설정
   jp3.setBorder(new TitledBorder("계산 결과 창"));
   // 경계선 설정
   ct = getContentPane();
   ct.setLayout(new BorderLayout(5,5));
   ct.add(jp3, BorderLayout.NORTH);
   ct.add(jp2, BorderLayout.CENTER);
   ct.add(jp1, BorderLayout.SOUTH);
   // 프레임에 판넬 3개 추가
   b0.addActionListener(this);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);
   b9.addActionListener(this);
   bpm.addActionListener(this);
   bdot.addActionListener(this);
   bp.addActionListener(this);
   bm.addActionListener(this);
   bmulti.addActionListener(this);
   bd.addActionListener(this);
   bsqrt.addActionListener(this);
   bpercent.addActionListener(this);
   bequal.addActionListener(this);
   bback.addActionListener(this);
   bc.addActionListener(this);
   // 모든 버튼에 리스너 등록
  }
  public void layout(Component obj, int x, int y,int width, int height)
  {
   cc.gridx=x; // 시작위치 x
   cc.gridy=y; // 시작위치 y
   cc.gridwidth=width; // 컨테이너 너비
   cc.gridheight=height;  // 컨테이너 높이
   jp1.add(obj,cc);
  }


  public static void main(String[] args){
   CalculatorDemo ccc = new CalculatorDemo();
   ccc.setTitle("Calculator");
   ccc.setSize(350,300);
   ccc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   ccc.setVisible(true);
   }
}

