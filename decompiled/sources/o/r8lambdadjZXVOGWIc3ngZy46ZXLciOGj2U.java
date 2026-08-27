package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.authentication.UserLinkingFailureReason;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "AnonymousUserLinker")
public class r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U {
    private final parseLonglambda0 IconCompatParcelizer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs RemoteActionCompatParcelizer;
    private final requestSingleLocationUpdateFromGooglePlaylambda30 read;
    private final getVerticalAccuracy serializer;
    private final r8lambdaI5dYrJApTBX5XA8keG9hJD19Zgw write;

    public r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U(parseLonglambda0 parselonglambda0, r8lambdaI5dYrJApTBX5XA8keG9hJD19Zgw r8lambdai5dyrjaptbx5xa8keg9hjd19zgw, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, getVerticalAccuracy getverticalaccuracy, requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30) {
        this.IconCompatParcelizer = parselonglambda0;
        this.write = r8lambdai5dyrjaptbx5xa8keg9hjd19zgw;
        this.RemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.serializer = getverticalaccuracy;
        this.read = requestsinglelocationupdatefromgoogleplaylambda30;
    }

    public static r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY serializer(r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U r8lambdadjzxvogwic3ngzy46zxlciogj2u, setCustomUserAttributelambda7 setcustomuserattributelambda7, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        r8lambdadjzxvogwic3ngzy46zxlciogj2u.IconCompatParcelizer.serializer("Successfully received token exchange result for user " + setcustomuserattributelambda7.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, new Object[0]);
        r8lambdadjzxvogwic3ngzy46zxlciogj2u.read.write(setcustomuserattributelambda7.read);
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty2 = r8lambdazcbg_e0hjusjy78mvgh54swzqty.read();
        r8lambdadjzxvogwic3ngzy46zxlciogj2u.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty2);
        return r8lambdazcbg_e0hjusjy78mvgh54swzqty2;
    }

    public final void IconCompatParcelizer(String str, r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA r8lambdak5px3nowmwv8genkijqvftf4qia) {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = this.RemoteActionCompatParcelizer;
        if (!r8lambdaw447glwjfoun4bg91upxnadqezs.MediaDescriptionCompat()) {
            r8lambdak5px3nowmwv8genkijqvftf4qia.RemoteActionCompatParcelizer(UserLinkingFailureReason.NO_USER, "No user exists");
            return;
        }
        this.write.RemoteActionCompatParcelizer(str, r8lambdaw447glwjfoun4bg91upxnadqezs.write().write().serializer(), new r8lambdapDqDae9wxPX0U0kxBZ3MrbxBXQU(this, r8lambdak5px3nowmwv8genkijqvftf4qia));
    }

    public static void IconCompatParcelizer(r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U r8lambdadjzxvogwic3ngzy46zxlciogj2u, r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA r8lambdak5px3nowmwv8genkijqvftf4qia, UserLinkingFailureReason userLinkingFailureReason, String str) {
        r8lambdadjzxvogwic3ngzy46zxlciogj2u.IconCompatParcelizer.RemoteActionCompatParcelizer("Error linking user: %s %s", userLinkingFailureReason.name(), str);
        r8lambdak5px3nowmwv8genkijqvftf4qia.RemoteActionCompatParcelizer(userLinkingFailureReason, str);
    }
}
