package com.github.tsfans.lc4e.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.github.tsfans.lc4e.utils.DataFetcher;
import com.github.tsfans.lc4e.utils.MenuConstants;

/**
 * view for problem list
 */
public class ProblemView {
    
    private Text text;

    /**
     * Create contents of the view part.
     */
    @PostConstruct
    public void createControls(Composite parent) {
        System.out.println("Enter in ProblemView postConstruct");
        
        parent.setLayout(new GridLayout(5, true));
        
        Button btnSignIn = new Button(parent, SWT.BORDER);
        btnSignIn.setText(MenuConstants.BTN_SIGN_IN);
        btnSignIn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Please enter username/password to sign in");
            }
        });
        
        Button btnSignOut = new Button(parent, SWT.NONE);
        btnSignOut.setText(MenuConstants.BTN_SIGN_OUT);
        btnSignOut.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Sign out suceess, ByeBye!");
            }
        });
        
        Button btnRefresh = new Button(parent, SWT.NONE);
        btnRefresh.setText(MenuConstants.BTN_REFRESH);
        btnRefresh.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Refresh problem list");
            }
        });
        
        Button btnPickOne = new Button(parent, SWT.NONE);
        btnPickOne.setText(MenuConstants.BTN_PICK_ONE);
        btnPickOne.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Randomly pick one problem");
            }
        });
        
        Button btnSearch = new Button(parent, SWT.NONE);
        btnSearch.setText(MenuConstants.BTN_SEARCH);
        btnSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Search problem");
            }
        });
        
        text = new Text(parent, SWT.BORDER);
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
        
        ToolBar toolBar = new ToolBar(parent, SWT.FLAT | SWT.RIGHT);
        toolBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 5, 1));
        
        ToolItem category = new ToolItem(toolBar, SWT.DROP_DOWN);
        category.setWidth(10);
        category.setText(MenuConstants.DROPDOWN_CATEGORY);
        Dropdown categoryDropdown = new Dropdown(category);
        DataFetcher.categoryMenu().forEach(categoryDropdown::add);
        category.addSelectionListener(categoryDropdown);
        
        ToolItem lists = new ToolItem(toolBar, SWT.DROP_DOWN);
        lists.setWidth(10);
        lists.setText(MenuConstants.DROPDOWN_LISTS);
        Dropdown listsDropdown = new Dropdown(lists);
        DataFetcher.listsMenu().forEach(listsDropdown::add);
        lists.addSelectionListener(listsDropdown);
        
        ToolItem difficulty = new ToolItem(toolBar, SWT.DROP_DOWN);
        difficulty.setWidth(10);
        difficulty.setText(MenuConstants.DROPDOWN_DIFFICULTY);
        Dropdown difficultyDropdown = new Dropdown(difficulty);
        DataFetcher.difficultyMenu().forEach(difficultyDropdown::add);
        
        ToolItem status = new ToolItem(toolBar, SWT.DROP_DOWN);
        status.setWidth(10);
        status.setText(MenuConstants.DROPDOWN_STATUS);
        Dropdown statusDropdown = new Dropdown(status);
        DataFetcher.statusMenu().forEach(statusDropdown::add);
        
        ToolItem tags = new ToolItem(toolBar, SWT.DROP_DOWN);
        tags.setWidth(10);
        tags.setText(MenuConstants.DROPDOWN_TAGS);
        Dropdown tagsDropdown = new Dropdown(tags);
        DataFetcher.tagsMenu().forEach(tagsDropdown::add);
        
        Table table = new Table(parent, SWT.BORDER | SWT.SINGLE);
        table.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 5, 1));
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
        for(String col : DataFetcher.columnHeaders()) {
            TableColumn tc = new TableColumn(table, SWT.NONE);
            tc.setText(col);
        }
        for(Question q : DataFetcher.questions()){
            TableItem item = new TableItem(table, SWT.NONE);
            item.setText(0, String.valueOf(q.getStatus()));
            item.setText(1, q.getTitle());
            item.setText(2, q.getAcceptance().toString());
            item.setText(3, String.valueOf(q.getDifficulty()));
            item.setText(4, q.getFrequency().toString());
        }
        
    }

    @PreDestroy
    public void dispose() {
    }

    @Focus
    public void setFocus() {
        // TODO	Set the focus to control
    }
}
