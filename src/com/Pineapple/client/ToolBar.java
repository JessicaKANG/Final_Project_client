package com.Pineapple.client;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;

import com.Pineapple.client.MenuBar;

public class ToolBar extends JToolBar{
	private MenuBar menuBar;
	/**
	 * 默认的构造方法
	 */
	private ToolBar() {
	}

	public ToolBar(MenuBar frameMenuBar) {
		super();
		this.menuBar = frameMenuBar;
		initialize();
	}

	/**
	 * 界面初始化方法
	 * 设置大小，加入各个按钮
	 */
	private void initialize() {
		setSize(new Dimension(600, 24));
		setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		add(createToolButton(menuBar.getcomputershopItem()));
		add(createToolButton(menuBar.getshoppingbagItem()));
		add(createToolButton(menuBar.getmyorderItem()));
		add(createToolButton(menuBar.getmyinformationItem()));
		
		
	}

	/**
	 * 创建工具栏按钮的方法
	 * 名称、图标、监听全都来自菜单项
	 * @return javax.swing.JButton
	 */
	private JButton createToolButton(final JMenuItem item) {
		JButton button = new JButton();
		button.setText(item.getText());
		button.setToolTipText(item.getText());
		button.setIcon(item.getIcon());
		button.setFocusable(false);
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				item.doClick();
			}
		});
		return button;
	}

	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

}
