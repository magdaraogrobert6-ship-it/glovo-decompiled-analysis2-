package o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class RgbExternalSyntheticLambda1 extends RgbExternalSyntheticLambda6 {
    public static final UriMatcher RemoteActionCompatParcelizer;

    @Override // o.RgbExternalSyntheticLambda6
    public final void IconCompatParcelizer(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return InputStream.class;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    @Override // o.RgbExternalSyntheticLambda6
    public final Object write(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        Uri uriLookupContact;
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = RemoteActionCompatParcelizer.match(uri);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch == 5) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (this.serializer && computeVerticalBoundsdefault.IconCompatParcelizer(uri) && computeVerticalBoundsdefault.write()) {
            AssetFileDescriptor assetFileDescriptorWrite = computeVerticalBoundsdefault.write(uri, contentResolver);
            if (assetFileDescriptorWrite == null) {
                throw new FileNotFoundException(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "FileDescriptor is null for: "));
            }
            try {
                inputStreamOpenContactPhotoInputStream = assetFileDescriptorWrite.createInputStream();
            } catch (IOException e) {
                try {
                    assetFileDescriptorWrite.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
            }
        } else {
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        throw new FileNotFoundException(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "InputStream is null for "));
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        RemoteActionCompatParcelizer = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public RgbExternalSyntheticLambda1(ContentResolver contentResolver, Uri uri, boolean z) {
        super(contentResolver, uri, z);
    }
}
