package fwfd.com.fwfsdk.model.api;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FlagKeysContainer {

    @SerializedName("result")
    private List<FlagKey> flagKeys;

    public List<FlagKey> getFlagKeys() {
        return this.flagKeys;
    }

    public void setFlagKeys(List<FlagKey> list) {
        this.flagKeys = list;
    }

    public List<String> getKeys() {
        ArrayList arrayList = new ArrayList();
        Iterator<FlagKey> it = this.flagKeys.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public FlagKeysContainer(List<FlagKey> list) {
        this.flagKeys = list;
    }

    public FlagKeysContainer() {
    }
}
