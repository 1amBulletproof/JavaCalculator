/*
 * Window Closing End Program Frame Listener
 */

package com.project.JavaCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameListener extends WindowAdapter
{
	
	int test;
	int doubletest;


	public void windowClosing(WindowEvent e)
	{
		
		System.exit(0);
	}
}
