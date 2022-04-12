package com.sigwalt.automobilista2.telemetry.application;

import com.sigwalt.automobilista2Telemetry.udpListener.UDPListener;

public class application {
	public static void main(String args[]) {
		UDPListener udpListener = new UDPListener(5606);
		Thread thread = new Thread(udpListener, "udpListener");
		thread.start();
		System.out.println(Thread.currentThread().getName());
	}
}
