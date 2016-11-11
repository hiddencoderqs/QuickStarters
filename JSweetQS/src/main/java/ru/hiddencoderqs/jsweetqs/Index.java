package ru.hiddencoderqs.jsweetqs;

import static def.react.react.Globals.createElement;
import static jsweet.dom.Globals.document;

import def.react.react.HTMLAttributes;
import def.react.react.ReactDOM;
import def.react.react.ReactElement;

public class Index {

	static final HTMLAttributes EMPTY = null;

	public static void main(String[] args) {
		ReactElement<?> rootElement = createElement("div", EMPTY, //
				createElement("h1", EMPTY, "Hello World"));
 
		ReactDOM.render(rootElement, document.getElementById("container"));
	}
}
