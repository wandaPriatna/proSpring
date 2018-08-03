package com.chap2.coretask;

import com.chap2part1.coretask.PrefixGenerator;

public class SequenceGenerator {
	
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	
	private PrefixGenerator prefixGenerator;

	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}
	
	public SequenceGenerator() {
		super();
	}

	public SequenceGenerator(String prefix, String suffix, int initial, int counter) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
		this.counter = counter;
	}
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefixGenerator.getPrefix());
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
	}
}
