package o;

import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class isActive {
    public final /* synthetic */ int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public isActive(getNetworkModule getnetworkmodule) {
        this.IconCompatParcelizer = 4;
        if (getnetworkmodule == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("treeDigest == null");
            throw null;
        }
        this.RemoteActionCompatParcelizer = getnetworkmodule;
        CustomerChatModulestartChat2 customerChatModulestartChat2RemoteActionCompatParcelizer = getFeature.RemoteActionCompatParcelizer(getnetworkmodule);
        String strSerializer = customerChatModulestartChat2RemoteActionCompatParcelizer.serializer();
        int iRemoteActionCompatParcelizer = strSerializer.equals("SHAKE128") ? 32 : strSerializer.equals("SHAKE256") ? 64 : customerChatModulestartChat2RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.write = iRemoteActionCompatParcelizer;
        int i = 16;
        this.serializer = 16;
        double d = iRemoteActionCompatParcelizer * 8;
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            } else {
                i4++;
            }
        }
        int iCeil = (int) Math.ceil(d / ((double) i4));
        int i5 = iCeil * 15;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            } else {
                i6++;
            }
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            } else {
                i2++;
            }
        }
        int iFloor = ((int) Math.floor(i6 / i2)) + 1 + iCeil;
        this.read = iFloor;
        if (((getProfileAttributesfwf_client_release) getProfileAttributesfwf_client_release.write.get(getProfileAttributesfwf_client_release.write(iRemoteActionCompatParcelizer, iFloor, customerChatModulestartChat2RemoteActionCompatParcelizer.serializer()))) != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cannot find OID for digest algorithm: ".concat(customerChatModulestartChat2RemoteActionCompatParcelizer.serializer()));
        throw null;
    }

    public void serializer(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z) {
        this.read = 0;
        int[] iArr = (int[]) this.RemoteActionCompatParcelizer;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.fullyDrawnReporter_delegatelambda00;
        if (recyclerView.MediaSessionCompatResultReceiverWrapper == null || layoutManager == null || !layoutManager._init_lambda1) {
            return;
        }
        if (z) {
            if (!recyclerView.ParcelableVolumeInfo.serializer()) {
                layoutManager.read(recyclerView.MediaSessionCompatResultReceiverWrapper.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            layoutManager.write(this.write, this.serializer, recyclerView.onCreatePanelMenu, this);
        }
        int i = this.read;
        if (i > layoutManager._init_lambda2) {
            layoutManager._init_lambda2 = i;
            layoutManager.createFullyDrawnExecutor = z;
            recyclerView.getLastCustomNonConfigurationInstance.RemoteActionCompatParcelizer();
        }
    }

    public void write(getLocalBitmaplambda8 getlocalbitmaplambda8) {
        getlocalbitmaplambda8.MediaBrowserCompatMediaItem = null;
        getlocalbitmaplambda8.MediaMetadataCompat = null;
        getlocalbitmaplambda8.read = null;
        getlocalbitmaplambda8.write = 1;
        int i = this.write;
        if (i > 0) {
            int i2 = this.read;
            if ((i2 & 1) == 0) {
                this.read = i2 + 1;
                this.write = i - 1;
                this.serializer++;
            }
        }
        getlocalbitmaplambda8.MediaMetadataCompat = (getLocalBitmaplambda8) this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = getlocalbitmaplambda8;
        int i3 = this.read;
        int i4 = i3 + 1;
        this.read = i4;
        int i5 = this.write;
        if (i5 > 0 && (i4 & 1) == 0) {
            this.read = i3 + 2;
            this.write = i5 - 1;
            this.serializer++;
        }
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            if ((this.read & i7) != i7) {
                return;
            }
            int i8 = this.serializer;
            if (i8 == 0) {
                getLocalBitmaplambda8 getlocalbitmaplambda9 = (getLocalBitmaplambda8) this.RemoteActionCompatParcelizer;
                getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda9.MediaMetadataCompat;
                getLocalBitmaplambda8 getlocalbitmaplambda11 = getlocalbitmaplambda10.MediaMetadataCompat;
                getlocalbitmaplambda10.MediaMetadataCompat = getlocalbitmaplambda11.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = getlocalbitmaplambda10;
                getlocalbitmaplambda10.read = getlocalbitmaplambda11;
                getlocalbitmaplambda10.MediaBrowserCompatMediaItem = getlocalbitmaplambda9;
                getlocalbitmaplambda10.write = getlocalbitmaplambda9.write + 1;
                getlocalbitmaplambda11.MediaMetadataCompat = getlocalbitmaplambda10;
                getlocalbitmaplambda9.MediaMetadataCompat = getlocalbitmaplambda10;
            } else if (i8 == 1) {
                getLocalBitmaplambda8 getlocalbitmaplambda12 = (getLocalBitmaplambda8) this.RemoteActionCompatParcelizer;
                getLocalBitmaplambda8 getlocalbitmaplambda13 = getlocalbitmaplambda12.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = getlocalbitmaplambda13;
                getlocalbitmaplambda13.MediaBrowserCompatMediaItem = getlocalbitmaplambda12;
                getlocalbitmaplambda13.write = getlocalbitmaplambda12.write + 1;
                getlocalbitmaplambda12.MediaMetadataCompat = getlocalbitmaplambda13;
                this.serializer = 0;
            } else if (i8 == 2) {
                this.serializer = 0;
            }
            i6 *= 2;
        }
    }

    public void serializer() {
        View view = (View) this.RemoteActionCompatParcelizer;
        int i = this.read;
        int top = view.getTop();
        int i2 = this.write;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view.offsetTopAndBottom(i - (top - i2));
        view.offsetLeftAndRight(0 - (view.getLeft() - this.serializer));
    }

    public void serializer(int i, int i2) {
        while (i != 0) {
            onSingleTapUp onsingletapup = ((onSingleTapUp[]) this.RemoteActionCompatParcelizer)[i >> 1];
            if ((i & 1) == 0) {
                i = onsingletapup.RemoteActionCompatParcelizer;
                onsingletapup.RemoteActionCompatParcelizer = i2;
            } else {
                i = onsingletapup.write;
                onsingletapup.write = i2;
            }
        }
    }

    public void read(int i, int i2) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Layout positions must be non-negative");
            return;
        }
        if (i2 >= 0) {
            int i3 = this.read;
            int i4 = i3 * 2;
            int[] iArr = (int[]) this.RemoteActionCompatParcelizer;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.RemoteActionCompatParcelizer = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.RemoteActionCompatParcelizer = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = (int[]) this.RemoteActionCompatParcelizer;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.read++;
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Pixel distance must be non-negative");
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.write; i++) {
            int length = sb.length();
            sb.append(i);
            if (i == this.serializer) {
                sb.append('*');
            }
            sb.append("        ".substring(sb.length() - length));
            sb.append(((onSingleTapUp[]) this.RemoteActionCompatParcelizer)[i]);
            sb.append('\n');
        }
        return sb.toString();
    }

    public int IconCompatParcelizer(int i, int i2) {
        onSingleTapUp onsingletapup;
        int i3;
        int i4;
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int i5 = i;
        while (true) {
            onsingletapup = ((onSingleTapUp[]) this.RemoteActionCompatParcelizer)[i5 >> 1];
            i3 = i5 & 1;
            if (i3 == 0) {
                i4 = onsingletapup.RemoteActionCompatParcelizer;
            } else {
                i4 = onsingletapup.write;
            }
            if (i4 == 0) {
                break;
            }
            i5 = i4;
        }
        if (i3 == 0) {
            onsingletapup.RemoteActionCompatParcelizer = i2;
            return i;
        }
        onsingletapup.write = i2;
        return i;
    }

    public /* synthetic */ isActive(int i) {
        this.IconCompatParcelizer = i;
    }

    public isActive(View view) {
        this.IconCompatParcelizer = 2;
        this.RemoteActionCompatParcelizer = view;
    }
}
