package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class getPrevious {
    public final Shader read;
    public final ColorStateList serializer;
    public int write;

    public getPrevious(Shader shader, ColorStateList colorStateList, int i) {
        this.read = shader;
        this.serializer = colorStateList;
        this.write = i;
    }

    public static getPrevious IconCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return new getPrevious(setNetworkUnavailableJob.IconCompatParcelizer(resources, xml, attributeSetAsAttributeSet, theme), null, 0);
        }
        if (name.equals("selector")) {
            ColorStateList colorStateListSerializer = getDown.serializer(resources, xml, attributeSetAsAttributeSet, theme);
            return new getPrevious(null, colorStateListSerializer, colorStateListSerializer.getDefaultColor());
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public final boolean RemoteActionCompatParcelizer() {
        ColorStateList colorStateList;
        return this.read == null && (colorStateList = this.serializer) != null && colorStateList.isStateful();
    }
}
