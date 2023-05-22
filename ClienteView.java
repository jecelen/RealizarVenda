import javax.swing.*;
import java.awt.*;


public class ClienteView extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JButton buscaCPF;
    private JButton cancelaVenda;
    private javax.swing.JTextField codProd;
    private javax.swing.JTextField codProd1;
    private javax.swing.JTextField codProd2;
    private javax.swing.JButton confirmaVenda;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField dadoCPF;
    private javax.swing.JTextField dadoNomeCli;
    private javax.swing.JComboBox<String> dadoPagamento;
    private javax.swing.JTextField descrProd;
    private javax.swing.JTextField descrProd1;
    private javax.swing.JTextField descrProd2;
    private javax.swing.JLabel entrega;
    private javax.swing.JRadioButton entregaNao;
    private javax.swing.JRadioButton entregaSim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton maisProd;
    private javax.swing.JLabel nomeCli;
    private javax.swing.JLabel pagamento;
    private javax.swing.JTextField qtddProd1;
    private javax.swing.JTextField qtddProd2;
    private javax.swing.JTextField qttdProd;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel tCodProd;
    private javax.swing.JLabel tDescricao;
    private javax.swing.JLabel tQtdd;
    private javax.swing.JLabel titulo;

	
	public ClienteView(){

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        tCodProd = new javax.swing.JLabel();
        tDescricao = new javax.swing.JLabel();
        tQtdd = new javax.swing.JLabel();
        codProd = new javax.swing.JTextField();
        codProd1 = new javax.swing.JTextField();
        codProd2 = new javax.swing.JTextField();
        descrProd = new javax.swing.JTextField();
        qttdProd = new javax.swing.JTextField();
        descrProd1 = new javax.swing.JTextField();
        descrProd2 = new javax.swing.JTextField();
        qtddProd1 = new javax.swing.JTextField();
        qtddProd2 = new javax.swing.JTextField();
        maisProd = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        cpf = new javax.swing.JLabel();
        nomeCli = new javax.swing.JLabel();
        dadoNomeCli = new javax.swing.JTextField();
        entrega = new javax.swing.JLabel();
        entregaSim = new javax.swing.JRadioButton();
        entregaNao = new javax.swing.JRadioButton();
        pagamento = new javax.swing.JLabel();
        dadoPagamento = new javax.swing.JComboBox<>();
        dadoCPF = new javax.swing.JTextField();
        buscaCPF = new javax.swing.JButton();
        confirmaVenda = new javax.swing.JButton();
        cancelaVenda = new javax.swing.JButton();
        
		setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Venda");
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.titulo.setFont(new Font("Roboto Light", 1, 24)); 
        this.titulo.setForeground(new Color(0, 204, 204));
        this.titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.titulo.setText("Área de Vendas");

        tCodProd.setFont(new Font("Roboto Light", 1, 12)); 
        tCodProd.setForeground(new Color(102, 102, 102));
        tCodProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tCodProd.setText("Código do produto");

        tDescricao.setFont(new Font("Roboto Light", 1, 12)); 
        tDescricao.setForeground(new Color(102, 102, 102));
        tDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tDescricao.setText("Descrição do produto");

        tQtdd.setFont(new Font("Roboto Light", 1, 12)); 
        tQtdd.setForeground(new Color(102, 102, 102));
        tQtdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tQtdd.setText("Quantidade");

        codProd.setFont(new Font("Roboto Light", 0, 12)); 
        codProd.setForeground(new Color(153, 153, 153));
        codProd.setSelectionColor(new java.awt.Color(0, 204, 204));


        codProd1.setFont(new Font("Roboto Light", 0, 12)); 
        codProd1.setForeground(new Color(153, 153, 153));
        codProd1.setSelectionColor(new java.awt.Color(0, 204, 204));


        codProd2.setFont(new Font("Roboto Light", 0, 12)); 
        codProd2.setForeground(new Color(153, 153, 153));
        codProd2.setSelectionColor(new java.awt.Color(0, 204, 204));


        descrProd.setEditable(false);
        descrProd.setFont(new Font("Roboto Light", 0, 12));
        descrProd.setForeground(new Color(153, 153, 153));


        qttdProd.setFont(new Font("Roboto Light", 0, 12)); 
        qttdProd.setForeground(new Color(153, 153, 153));
        //qttdProd.setMaximumSize(new java.awt.Dimension(64, 21));
        qttdProd.setSelectionColor(new Color(0, 204, 204));

        descrProd1.setEditable(false);
        descrProd1.setFont(new Font("Roboto Light", 0, 12)); 
        descrProd1.setForeground(new Color(153, 153, 153));


        descrProd2.setEditable(false);
        descrProd2.setFont(new Font("Roboto Light", 0, 12)); 
        descrProd2.setForeground(new Color(153, 153, 153));


        qtddProd1.setFont(new java.awt.Font("Roboto Light", 0, 12)); 
        qtddProd1.setForeground(new Color(153, 153, 153));
        qtddProd1.setSelectionColor(new Color(0, 204, 204));


        qtddProd2.setFont(new Font("Roboto Light", 0, 12)); 
        qtddProd2.setForeground(new Color(153, 153, 153));
        qtddProd2.setSelectionColor(new Color(0, 204, 204));


        maisProd.setBackground(new Color(0, 204, 204));
        maisProd.setFont(new Font("Roboto Light", 1, 24)); 
        maisProd.setForeground(new Color(255, 255, 255));
        maisProd.setText("+");

        cpf.setFont(new Font("Roboto Light", 1, 12));
        cpf.setForeground(new Color(102, 102, 102));
        cpf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cpf.setText("CPF do Cliente:");

        nomeCli.setFont(new Font("Roboto Light", 1, 12)); 
        nomeCli.setForeground(new Color(102, 102, 102));
        nomeCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeCli.setText("Nome do Cliente:");

        dadoNomeCli.setEditable(false);
        dadoNomeCli.setFont(new Font("Roboto Light", 0, 12)); 
        dadoNomeCli.setForeground(new Color(153, 153, 153));


        entrega.setFont(new Font("Roboto Light", 1, 12)); 
        entrega.setForeground(new Color(102, 102, 102));
        entrega.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        entrega.setText("Cliente solicitou entrega?");

        entregaSim.setFont(new Font("Roboto Light", 1, 12)); 
        entregaSim.setForeground(new java.awt.Color(102, 102, 102));
        entregaSim.setText("Sim");


        entregaNao.setFont(new Font("Roboto Light", 1, 12)); 
        entregaNao.setForeground(new java.awt.Color(102, 102, 102));
        entregaNao.setText("Não");

        pagamento.setFont(new Font("Roboto Light", 1, 12)); 
        pagamento.setForeground(new java.awt.Color(102, 102, 102));
        pagamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pagamento.setText("Selecione a forma de pagamento:");

        dadoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dinheiro", "PIX", "Cartão de Débito", "Cartão de Crédito" }));
        dadoPagamento.setToolTipText("Selecione");

        dadoCPF.setFont(new Font("Roboto Light", 0, 12));
        dadoCPF.setForeground(new java.awt.Color(153, 153, 153));
        dadoCPF.setSelectionColor(new java.awt.Color(0, 204, 204));
        
        

        buscaCPF.setBackground(new Color(0, 204, 204));
        buscaCPF.setFont(new Font("Roboto Light", 1, 12)); // NOI18N
        buscaCPF.setForeground(new java.awt.Color(255, 255, 255));
        buscaCPF.setText("Buscar");

        confirmaVenda.setBackground(new Color(0, 204, 204));
        confirmaVenda.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        confirmaVenda.setForeground(new Color(255, 255, 255));
        confirmaVenda.setText("Confirmar venda");

        cancelaVenda.setBackground(new Color(255, 51, 51));
        cancelaVenda.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cancelaVenda.setForeground(new Color(255, 255, 255));
        cancelaVenda.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dadoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entregaSim, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entregaNao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codProd1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tCodProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codProd)
                                    .addComponent(codProd2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(descrProd)
                                            .addComponent(tDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qttdProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tQtdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(descrProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtddProd1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(descrProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtddProd2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maisProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dadoNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dadoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCodProd)
                    .addComponent(tDescricao)
                    .addComponent(tQtdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descrProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qttdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descrProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtddProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descrProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtddProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maisProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(dadoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCli)
                    .addComponent(dadoNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrega)
                    .addComponent(entregaSim)
                    .addComponent(entregaNao))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagamento)
                    .addComponent(dadoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaVenda)
                    .addComponent(cancelaVenda))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

	}
}
