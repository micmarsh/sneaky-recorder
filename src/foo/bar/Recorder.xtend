package foo.bar

class Recorder {
	
	static val recorder = SimpleAudioRecorder::getInstance()
	
	def static void main(String[] args){
		recorder.start
		
		System::in.read()
		
		recorder.stopRecording
	}
}