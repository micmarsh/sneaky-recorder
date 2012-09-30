package foo.bar;

import com.tulskiy.keymaster.common.HotKey;
import com.tulskiy.keymaster.common.Provider;
import com.tulskiy.keymaster.common.HotKeyListener;

import javax.swing.KeyStroke;

public class Recorder {
	
	static SimpleAudioRecorder recorder = SimpleAudioRecorder.getInstance();
	
	static final String DEFAULT_KEY = "shift ctrl SPACE";
	
	
	public static void main(String[] args){
		Provider provider = Provider.getCurrentProvider(false);
		provider.register(KeyStroke.getKeyStroke(DEFAULT_KEY),new HotKeyListener(){
			@Override
			public void onHotKey(HotKey arg0) {
				
			}

		});
	}
}