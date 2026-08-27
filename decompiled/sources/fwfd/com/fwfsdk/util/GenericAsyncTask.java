package fwfd.com.fwfsdk.util;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GenericAsyncTask<T> {
    private GenericAsyncTaskCallback callback;

    public interface GenericAsyncTaskCallback<T> {
        void onResult(T t);
    }

    public class GenericProcessAsyncTask extends AsyncTask<Void, Void, T> {
        private GenericProcessAsyncTask() {
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(T t) {
            if (GenericAsyncTask.this.callback != null) {
                GenericAsyncTask.this.callback.onResult(t);
            }
        }

        @Override // android.os.AsyncTask
        public T doInBackground(Void... voidArr) {
            return (T) GenericAsyncTask.this.doAsync();
        }
    }

    public abstract T doAsync();

    public GenericAsyncTask(GenericAsyncTaskCallback genericAsyncTaskCallback) {
        this.callback = genericAsyncTaskCallback;
    }

    public void start() {
        new GenericProcessAsyncTask().execute(new Void[0]);
    }
}
