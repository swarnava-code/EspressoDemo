package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdapterViewActivity extends AppCompatActivity {
    String[] items = {"ACI","ADC A","ADC B","ADC C","ADC D","ADC E","ADC H","ADC L","ADC M","ADD A","ADD B","ADD C","ADD D","ADD E","ADD H","ADD L","ADD M",
            "ADI",
            "ANA A","ANA B","ANA C","ANA D","ANA E","ANA H","ANA L","ANA M",
            "ANI",
            "CALL",
            "CC",
            "CM",
            "CMA",
            "CMC",
            "CMP A","CMP B","CMP C","CMP D","CMP E","CMP H","CMP L","CMP M",
            "CNC",
            "CNZ",
            "CP",
            "CPE",
            "CPI",
            "CPO",
            "CZ",
            "DAA",
            "DAD B","DAD D","DAD H","DAD SP",
            "DCR A","DCR B","DCR C","DCR D","DCR E","DCR H","DCR L","DCR M",
            "DCX B","DCX D","DCX H","DCX SP",
            "DI",
            "EI",
            "HLT",
            "IN",
            "INR A","INR B","INR C","INR D","INR E","INR H","INR L","INR M",
            "INX B","INX D","INX H","INX SP",
            "JC",
            "JM",
            "JMP",
            "JNC",
            "JNZ",
            "JP",
            "JPE",
            "JPO",
            "JZ",
            "LDA",
            "LDAX B","LDAX D",
            "LHLD ",
            "LXI B","LXI D","LXI H","LXI SP ",
            "MOV A, A","MOV A, B","MOV A, C","MOV A, D","MOV A, E","MOV A, H","MOV A, L","MOV A, M","MOV B, A","MOV B, B","MOV B, C","MOV B, D ","MOV B, E ","MOV B, H ","MOV B, L","MOV B, M","MOV C, A","MOV C, B","MOV C, C","MOV C, D","MOV C, E","MOV C, H","MOV C, L","MOV C, M","MOV D, A","MOV D, B","MOV D, C","MOV D, D","MOV D, E","MOV D, H","MOV D, L","MOV D, M","MOV E, A","MOV E, B","MOV E, C","MOV E, D","MOV E, E","MOV E, H","MOV E, L","MOV E, M","MOV H, A","MOV H, B","MOV H, C","MOV H, D","MOV H, E","MOV H, H","MOV H, L","MOV H, M","MOV L, A","MOV L, B","MOV L, C","MOV L, D","MOV L, E","MOV L, H","MOV L, L","MOV L, M","MOV M, A","MOV M, B" ,"MOV M, C" ,"MOV M, D ","MOV M, E" ,"MOV M, H ","MOV M, L",
            "MVI A","MVI B","MVI C","MVI D","MVI E","MVI H","MVI L","MVI M",
            "NOP",
            "ORA A","ORA B ","ORA C","ORA D","ORA E","ORA H","ORA L","ORA M",
            "ORI",
            "OUT",
            "PCHL",
            "POP B", "POP D","POP H","POP PSW",
            "PUSH B","PUSH D","PUSH H","PUSH PSW",
            "RAL",
            "RAR",
            "RC",
            "RET",
            "RIM",
            "RLC",
            "RM",
            "RNC",
            "RNZ",
            "RP",
            "RPE",
            "RPO",
            "RRC",
            "RST 0","RST 1","RST 2","RST 3","RST 4","RST 5","RST 6","RST 7",
            "RZ",
            "SBB A","SBB B","SBB C","SBB D","SBB E","SBB H","SBB L","SBB M",
            "SBI",
            "SHLD",
            "SIM",
            "SPHL",
            "STA",
            "STAX B","STAX D",
            "STC",
            "SUB A","SUB B","SUB C","SUB D","SUB E","SUB H","SUB L","SUB M",
            "SUI",
            "XCHG",
            "XRA A","XRA B","XRA C","XRA D","XRA E","XRA H","XRA L","XRA M",
            "XRI",
            "XTHL"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view);

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        ListView listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(itemsAdapter);

    }

}