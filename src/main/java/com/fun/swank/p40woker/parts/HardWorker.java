package com.fun.swank.p40woker.parts;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 * Created by acorn on 7/18/15.
 */
class HardWorker extends SwingWorker<String, Integer> {
  private final JTextArea output;

  HardWorker(JTextArea output) {
    this.output = output;
  }

  /**
   * do not do anything with GUI object in this method.
   * runs on Worker Thread (WT)
   *
   * @return
   * @throws Exception
   */
  @Override
  protected String doInBackground() throws Exception {
    for (int i = 0; i < 7000000; i++) {
      if (0 == i % 10000) {
        super.publish(i);
        System.out.println("doInBackground() " + Thread.currentThread().getName());
        Thread.sleep(1, 1);
      }
    }
    // this return string can be obtained by get() method in done() method. see done() method below
    return "Whew... it look a long time";
  }

  /**
   * This method is a call back
   * runs on EDT
   * This is async so frequency of this method gets called is non-deterministic
   *
   * @param chunks that is publish(ed) within doInBackground()
   */
  @Override
  protected void process(List<Integer> chunks) {
    for (int number : chunks) {
      output.append(number + " ");
    }
    output.append("\n--WoW--\n");
    output.append("\nprocess() " + Thread.currentThread().getName());
  }

  /**
   * callback
   * runs on EDT
   */
  @Override
  protected void done() {
    try {
      // Note get() blocks thread so make sure call this in done() method.
      output.append(get());
      output.append("\ndone() " + Thread.currentThread().getName());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
