import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MainController {

    public String onAjaxBasic() {
        return "ajax/ajaxBasic.xhtml";
    }

    public String onAjaxEvent() {
        return "ajax/ajaxEvent.xhtml";
    }

    public String onAjaxListener() {
        return "ajax/ajaxListener.xhtml";
    }

    public String onAjaxValidation() {
        return "ajax/ajaxValidation.xhtml";
    }

    public String onAjaxDropdown() {
        return "ajax/ajaxDropdown.xhtml";
    }

    public String onAjaxPoll() {
        return "ajax/ajaxPoll.xhtml";
    }

    public String onAjaxStatus() {
        return "ajax/ajaxStatus.xhtml";
    }

    public String onAutoComplete() {
        return "ui/autoComplete.xhtml";
    }

    public String onInputTextArea() {
        return "ui/inputTextArea.xhtml";
    }

    public String onBooleanButton() {
        return "ui/booleanButton.xhtml";
    }

    public String onBooleanCheckBox() {
        return "ui/booleanCheckBox.xhtml";
    }

    public String onCalendar() {
        return "ui/calendar.xhtml";
    }

    public String onCheckboxMenu() {
        return "ui/checkboxMenu.xhtml";
    }

    public String onEditor() {
        return "ui/editor.xhtml";
    }

    public String onInputText() {
        return "ui/inputText.xhtml";
    }

    public String onInputMask() {
        return "ui/inputMask.xhtml";
    }
    public String onListBox() {
        return "ui/listBox.xhtml";
    }
}
