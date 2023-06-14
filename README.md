                                         PC Configurator Application

A local computer store wants to build a brand-new website for selling computers, allowing the customers to choose individual parts. From the store owner’s previous experience, customers often buy parts that are incompatible, which leads to the store covering return shipping expenses and reduces the profit of the store.
In order to minimize their expenses, the store wants to build a computer configurator that will not allow the customer to buy incompatible parts. 
You are tasked to create a PC configurator that suggests valid configurations or validates the compatibility of the customer’s choice of components.
The store sells 3 types of components:	
CPUс
DDR Memory
Motherboards
Each component has properties that define its compatibility with other components:
CPUs – CPU compatibility is defined by the Socket of the CPU and the Memory type Supported. 
CPUs are compatible only with Motherboards with the same socket.
CPUs are compatible only with the type of memory they support.
DDR Memory 
Memory is compatible only with CPUs that support it.
Motherboards
Motherboards are compatible with CPUs with the same socket.
In the real world some motherboards and CPUs support multiple memory types. For the purposes of this task those cases should not be taken into consideration and only the limitations listed above should be used. 

Task requirements:
The list of items in the inventory is stored in a file named “pc-store-inventory.json”.
Implement a console application that loads the inventory, accepts a CPU, Memory and Motherboard part numbers and generates configurations with the selected parts. 
When the user provides a full list of components the provided configuration is validated and if valid the price is calculated.
When the user provides part of the components, all possible configurations with the provided components are listed and price calculated.
When the user provides incompatible list of components, they should see an error message indicating what the issue is.
Example input and output:
--------------------------------------------------------------------------
  Please enter part number(s): 12900K  
  There are 5 possible combinations:
  Combination 1
  	CPU - Intel® Core™ i9-12900K Processor –LGA1700, DDR5
	Motherboard - MSI MAG Z690 TORPEDO - LGA1700
	Memory - Samsung 32GB M323R4GA3BB0-CQKOL – DDR5
      Price: 1111
. . . 

  Please enter part number(s): 12900K, 12500  
  ERROR: Please choose different component types
  
  Please enter part number(s): 12900K, MSIZ690, CR8GB
  ERROR: The selected configuration is not valid.
Memory of type DDR4 is not compatible with the CPU
…

Example of a working configuration: 
Intel® Core™ i9-12900K Processor – LGA1700, DDR5
Motherboard - MSI MAG Z690 TORPEDO - LGA1700
Memory - Samsung 32GB M323R4GA3BB0-CQKOL – DDR5

Example of a non-working configuration:
Intel® Core™ i9-12900K Processor –LGA1700, DDR5
Motherboard - MSI MAG Z690 TORPEDO - LGA1700
Memory - G.Skill 8GB F4-3600C16D-16GVK – DDR4
