import { Button } from '@hilla/react-components/Button.js';
import { Notification } from '@hilla/react-components/Notification.js';
import { TextField } from '@hilla/react-components/TextField.js';
import { HelloReactEndpoint } from 'Frontend/generated/endpoints';
import {useEffect, useState} from 'react';
import Note from "Frontend/generated/com/example/application/Note";

export default function HelloReactView() {
  const [name, setName] = useState('');
  const [note,setNote] = useState<Note>();

  useEffect(() =>{
      HelloReactEndpoint.getNote().then(setNote);}
  ,[])

  return (
    <>
      <section className="flex p-m gap-m items-end">
        <TextField
          label="Your name"
          onValueChanged={(e) => {
            setName(e.detail.value);
          }}
        />
        <Button
          onClick={async () => {
            const serverResponse = await HelloReactEndpoint.sayHello(name);
            Notification.show(serverResponse);
          }}
        >
          Say hello
        </Button>
      </section>
        <section>
            <div className="container mx-auto bg-gray-200 rounded-xl shadow border p-8 m-10">
            <h1 className="">{note?.title?.toUpperCase()}</h1>
            <h2>CREATED AT : {note?.created?.toUpperCase()}</h2>
            <h4>PRIORITY : {note?.priority?.toUpperCase()}</h4>
            <p>{note?.content}</p>
            </div>
        </section>

        <div className="container mx-auto bg-gray-200 rounded-xl shadow border p-8 m-10">
            <p className="text-3xl text-gray-700 font-bold mb-5">
                Welcome!
            </p>
            <p className="text-gray-500 text-lg">
                React and Tailwind CSS in action
            </p>
        </div>

        <h1 className="text-3xl font-bold underline">
            Hello world!
        </h1>
    </>
  );
}
