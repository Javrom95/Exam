package com.example.javier.exam2;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by javier on 7/03/16.
 */
public class LoginTest extends ActivityInstrumentationTestCase2<Login> {

    public LoginTest() {
        super(Login.class);
    }

    private static final String USERNAME = "aladeen";
    private Login actividad;
    private Button loginBtn;
    private EditText usuario;

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        usuario = (EditText) actividad.findViewById(R.id.user);
        loginBtn = (Button) actividad.findViewById(R.id.button);

    }

    public void test2() {

        TouchUtils.tapView(this, usuario);
        getInstrumentation().sendStringSync(USERNAME);
        TouchUtils.clickView(this, loginBtn);

        String user = usuario.getText().toString();

        assertTrue("Add result should be..."+user, user.equals(USERNAME));
    }

}
